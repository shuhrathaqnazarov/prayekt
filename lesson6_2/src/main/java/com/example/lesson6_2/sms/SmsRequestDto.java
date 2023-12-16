package com.example.lesson6_2.sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsRequestDto {
    private String phoneNumber;
    private String message;
}
