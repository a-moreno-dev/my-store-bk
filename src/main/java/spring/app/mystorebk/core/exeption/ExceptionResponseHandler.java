package spring.app.mystorebk.core.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ExceptionResponseHandler {
    @ExceptionHandler(value = {RuntimeExceptionResponse.class})
    public ResponseEntity<Object> responseExceptionHandler(RuntimeExceptionResponse exception) {
        ExceptionResponseDto oExceptionResponseDto = ExceptionResponseDto
                .builder()
                .date(LocalDateTime.now())
                .httpStatusCode(HttpStatus.BAD_REQUEST.value())
                .httpStatus(HttpStatus.BAD_REQUEST)
                .error(exception.getMessage())
                .build();
        return new ResponseEntity<>(oExceptionResponseDto, HttpStatus.BAD_REQUEST);
    }
}
