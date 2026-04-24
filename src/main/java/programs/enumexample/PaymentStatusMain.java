package programs.enumexample;

public class PaymentStatusMain {
    public static void main(String[] args) {
        System.out.println(PaymentStatus.SUCCESS);
        System.out.println(PaymentStatus.PENDING);
        System.out.println(PaymentStatus.FAILED);
    }
}

enum PaymentStatus {
    SUCCESS,
    FAILED,
    PENDING;
}

