package programs.designpattern.behavioral.template;

public class OnlineOrder extends OrderProcess {

    public void selectItem() {
        System.out.println("Item selected online");
    }

    public void makePayment() {
        System.out.println("Payment done online");
    }
}
