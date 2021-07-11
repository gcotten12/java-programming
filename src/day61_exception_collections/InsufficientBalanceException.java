package day61_exception_collections;

public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException() {}

    public InsufficientBalanceException(String errorMessage) {
        super(errorMessage);
    }

}
