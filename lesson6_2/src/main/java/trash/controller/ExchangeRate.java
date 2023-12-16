package trash.controller;

import trash.exchange.CbuExchangeRateFeign;
import trash.exchange.CbuResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exchange-rate")
@RequiredArgsConstructor
public class ExchangeRate {
    private final CbuExchangeRateFeign cbuExchangeRateFeign;

    @GetMapping
    public CbuResponseDto getRate(){
        return cbuExchangeRateFeign
                .getExchangeRates()
                .stream()
                .filter(rate -> rate.getId().equals(69))
                .findFirst()
                .orElseThrow();
    }

}
