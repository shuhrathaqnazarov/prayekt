package com.example.lesson6_2.eskiz;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class EskizSendSmsDto {
    @JsonProperty("from")
    private String from;
    @JsonProperty("message")
    private String message;
    @JsonProperty("mobile_phone")
    private String phoneNumber;

}
