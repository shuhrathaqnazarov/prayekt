package com.example.lesson6_2.sms;

import com.example.lesson6_2.eskiz.EskizFeign;
import com.example.lesson6_2.eskiz.EskizSendSmsDto;
import com.example.lesson6_2.eskiz.EskizSignInDto;
import com.example.lesson6_2.eskiz.EskizSignInResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("/sms")
@RequiredArgsConstructor
public class SmsController {
    private final EskizFeign eskizFeign;
    private final EskizSignInDto eskizSignInDto;
    @PostMapping
    public String sendSms(@ModelAttribute SmsRequestDto smsRequestDto){
        EskizSignInResponseDto responseDto= eskizFeign.signIn(eskizSignInDto);
        EskizSendSmsDto smsDto = new EskizSendSmsDto("4546", smsRequestDto.getMessage(), smsRequestDto.getPhoneNumber());
        HashMap<String, String> headers = new HashMap<>(){{
            put(HttpHeaders.AUTHORIZATION,"Bearer "+responseDto.getToken());
        }};

        String sendsSmsResponse = eskizFeign.sendSms(smsDto, headers);
        System.out.println(sendsSmsResponse);
        return "redirect:/";
        }

}
