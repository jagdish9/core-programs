package programs.soliddesignprinciples.openclosedprinciple.solution;

public interface Payment {
    void pay();
}

class Card implements Payment {

    @Override
    public void pay() {
        System.out.println("Processing Card payment");
    }
}

class UpiPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Processing upi payment");
    }
}

/*
Now if we want to add new payment(PayPal) method we don't need to modify code,
 we can create class and implement interface P

 */