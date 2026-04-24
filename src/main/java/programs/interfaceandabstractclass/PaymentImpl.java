package programs.interfaceandabstractclass;

public class PaymentImpl implements Payment, CreditPayment{
    @Override
    public void pay() {
        System.out.println("pay method implementation");
    }
}
