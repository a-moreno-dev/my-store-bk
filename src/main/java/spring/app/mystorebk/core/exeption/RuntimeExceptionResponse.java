package spring.app.mystorebk.core.exeption;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RuntimeExceptionResponse extends RuntimeException {
    public RuntimeExceptionResponse(String sMessage) {
        super(sMessage);
    }
    public RuntimeExceptionResponse(String sMessage, Throwable oCause) {
        super(sMessage, oCause);
    }
}
