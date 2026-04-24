package programs.exception.unchecked;

public class InvalidAgeRuntimeException extends RuntimeException {

    public InvalidAgeRuntimeException(String message) {
        super(message);
    }
}
