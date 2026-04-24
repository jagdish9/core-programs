package programs.designpattern.creational.factory;

public class Card implements Payment {
    public void pay() {
        System.out.println("Paid using Card");
    }
}
