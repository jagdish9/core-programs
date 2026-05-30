package programs.soliddesignprinciples.openclosedprinciple.problem;

public class PaymentService {
    public void pay(String type) {
        if(type.equals("CARD")) {
            System.out.println("Processing Card Payment");
        } else if(type.equals("UPI")) {
            System.out.println("Processing UPI Payment");
        }
    }
}

/*
If we want to add new payment method, we need to modify this class

(Open for extension and closed for modification)
 */