package com.email.writer.api.EmailGenerator;

import com.email.writer.EmailRequest;
import org.springframework.stereotype.Service;

@Service
public class EmailGeneratorService {

    public String generateEmailReply(EmailRequest emailRequest) {
        //Build the prompt
        String prompt = buildPrompt(emailRequest);

        //Craft the request using the Gemini API request body as we need to follow the structure
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
