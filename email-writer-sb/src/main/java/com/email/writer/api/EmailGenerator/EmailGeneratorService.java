package com.email.writer.api.EmailGenerator;

import com.email.writer.api.EmailGenerator.model.EmailRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EmailGeneratorService {

    //we are setting the URL and key as env variables in configuration and in application.properties file
    @Value("${gemini.api.url}")
    private String geminiApiUrl;

    @Value("${gemini.api.key}")
    private String geminiApiKey;

    public String generateEmailReply(EmailRequest emailRequest) {
        //Build the prompt
        String prompt = buildPrompt(emailRequest);

        //Craft the request using the Gemini API request body given below as we need to follow the structure of it:
        /*
                 {
                    "contents": [
                      {
                        "parts": [
                          {
                            "text": "Explain how AI works in a few words"
                          }
                        ]
                      }
                    ]
                  }
        */
        //in (key, value) , for value we are using Object array.
        Map<String, Object> requestBody = Map.of(
                "contents", new Object[] {
                        Map.of(
                                "parts", new Object[] {
                                        Map.of(
                                                "text", prompt
                                        )
                                })
                }
        );
        //Do request and get response

        //Return response

        return null;
    }

    private String buildPrompt(EmailRequest emailRequest) {

        StringBuilder prompt = new StringBuilder();
        prompt.append("Generate a professional email reply for the following email content." +
                "Don't generate a subject line ");

        //if you want to specify the tone type as sarcastic/funny/casual/professional
        if(emailRequest.getTone() != null && emailRequest.getTone().isEmpty()){

            //prompt.append("Use a ").append(emailRequest.getTone()).append(" tone.");
            prompt.append(String.format("Use a %s tone.", emailRequest.getTone()));
        }
        prompt.append("\nOriginal Email : \n").append(emailRequest.getEmailContent());
        return prompt.toString();
    }
}
