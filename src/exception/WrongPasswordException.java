package exception;

public class WrongPasswordException extends RuntimeException {

    public WrongPasswordException(String errorMessage) {
        super(errorMessage);
    }
}
