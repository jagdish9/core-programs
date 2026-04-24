package programs.interfaceandabstractclass;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentImpl payment = new PaymentImpl();
        payment.pay();
    }
}
