package amadorcf.es.YourBank_account_service.exception;

public class AccountStatusException extends GlobalException {
    public AccountStatusException(String errorMessage) {
        super(errorMessage, GlobalErrorCode.BAD_REQUEST);
    }
}
