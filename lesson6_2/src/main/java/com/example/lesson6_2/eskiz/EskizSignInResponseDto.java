package com.example.lesson6_2.eskiz;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EskizSignInResponseDto {
    private String message;

    @JsonProperty("token_type")
    private String tokenType;

    public String getToken(){
        return this.data.getToken();
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    class ResponseData {
        private String token;

    }

}
