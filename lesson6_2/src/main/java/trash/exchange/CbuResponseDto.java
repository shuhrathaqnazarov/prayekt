package trash.exchange;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CbuResponseDto {
    private Integer id;
    @JsonProperty("Code")
    private String currencyCode;

    @JsonProperty("Ccy")
    private String currency;

    @JsonProperty("CcyNm_RU")
    private String currencyNameRU;

    @JsonProperty("CcyNm_UZ")
    private String currencyNameUZ;

    @JsonProperty("CcyNm_UZC")
    private String currencyNameUzCr;

    @JsonProperty("CcyNm_EN")
    private String currencyNameEN;

    @JsonProperty("Nominal")
    private String nominal;

    @JsonProperty("Rate")
    private String rate;
    @JsonProperty("Diff")
    private String difference;
    @JsonProperty("Date")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "dd.MM.yyyy")
    private LocalDate date;
}
