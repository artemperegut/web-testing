package utils;

public class FailException extends RuntimeException {

    public FailException() {
        super("Test error");
    }

    public FailException(String message) {
        super(message);
    }
}