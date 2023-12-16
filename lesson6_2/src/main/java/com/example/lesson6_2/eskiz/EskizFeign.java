package com.example.lesson6_2.eskiz;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@FeignClient(value = "eskizFeign",url = "notify.eskiz.uz/api")
public interface EskizFeign {
    @PostMapping("/auth/login")
    EskizSignInResponseDto signIn(@RequestBody EskizSignInDto signInDto);
    @PostMapping("/message/sms/send")
    String sendSms(@RequestBody EskizSendSmsDto eskizSendSmsDto, @RequestHeader Map<String,String> headers);
}
