package com.example.lesson6_2.eskiz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class EskizSignInDto {
    @Value("${application.eskiz.email}")
    private String email;
    @Value("${application.eskiz.password}")
    private String password;
}
