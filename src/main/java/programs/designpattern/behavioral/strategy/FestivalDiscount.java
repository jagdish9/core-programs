package programs.designpattern.behavioral.strategy;

public class FestivalDiscount implements DiscountStrategy {

    public double apply(double amount) {
        return amount * 0.9;
    }
}
