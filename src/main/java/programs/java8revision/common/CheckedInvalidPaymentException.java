package programs.java8revision.common;

public class CheckedInvalidPaymentException extends Exception {
    public CheckedInvalidPaymentException(String message) {
        super(message);
    }
}

class HandleExample {
    public void processPayment(double amount) throws CheckedInvalidPaymentException {
        if(amount <= 0) {
            throw new CheckedInvalidPaymentException("Amount must be greater than zero");
        }
    }
}

//Must be handled or declared using throws.
