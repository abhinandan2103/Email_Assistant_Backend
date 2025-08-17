package com.email.writer;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
