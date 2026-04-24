package programs.designpattern.behavioral.strategy;

public class NoDiscount implements DiscountStrategy {

    public double apply(double amount) {
        return amount;
    }
}
