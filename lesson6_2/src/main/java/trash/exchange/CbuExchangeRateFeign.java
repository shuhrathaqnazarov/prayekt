package trash.exchange;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "cbuExchangeRateFeign", url = "https://cbu.uz/uz/arkhiv-kursov-valyut/json/")
public interface CbuExchangeRateFeign {
    @GetMapping
    List<CbuResponseDto> getExchangeRates();
}
