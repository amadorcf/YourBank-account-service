package amadorcf.es.YourBank_account_service.exception;

import lombok.Getter;

@Getter
public class GlobalException extends RuntimeException{

    private final String errorCode;

    private final String errorMessage;

    public GlobalException(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

}