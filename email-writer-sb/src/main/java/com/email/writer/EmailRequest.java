package com.email.writer;

import lombok.Data;

//@Data annotation helps create getter, setter, constructor.
@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
