package programs.designpattern.creational.factory;

public class PaymentFactory {

    public static Payment getPayment(String type) {
        if(type.equals(PaymentType.UPI.name())) {
            return new UPI();
        } else if(type.equals(PaymentType.CARD.name())) {
            return new Card();
        }

        return null;
    }
}
