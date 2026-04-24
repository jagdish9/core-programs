package programs.designpattern.behavioral.template;

public abstract class OrderProcess {

    public final void processOrder() {
        selectItem();
        makePayment();
        deliver();
    }

    abstract void selectItem();
    abstract void makePayment();

    void deliver() {
        System.out.println("Delivered");
    }
}
