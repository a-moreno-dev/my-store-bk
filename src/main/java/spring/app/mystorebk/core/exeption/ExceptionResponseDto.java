package spring.app.mystorebk.core.exeption;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@Builder
public class ExceptionResponseDto {
    private LocalDateTime date;
    private Integer httpStatusCode;
    private HttpStatus httpStatus;
    private String error;
}
