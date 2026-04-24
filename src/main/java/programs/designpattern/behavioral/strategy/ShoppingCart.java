package programs.designpattern.behavioral.strategy;

public class ShoppingCart {

    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void checkout(double amount) {
        System.out.println("Final Amount: "+ discountStrategy.apply(amount));
    }
}
