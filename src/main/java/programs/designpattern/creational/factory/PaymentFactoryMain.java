package programs.designpattern.creational.factory;

public class PaymentFactoryMain {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.getPayment(PaymentType.UPI.name());
        payment.pay();

        Payment payment1 = PaymentFactory.getPayment(PaymentType.CARD.name());
        payment1.pay();
    }
}

//Client doesn’t know object creation logic
