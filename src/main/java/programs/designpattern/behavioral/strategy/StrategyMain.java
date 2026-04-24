package programs.designpattern.behavioral.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setDiscountStrategy(new FestivalDiscount());
        cart.checkout(1000);

        cart.setDiscountStrategy(new NoDiscount());
        cart.checkout(1000);
    }
}

//Runtime behavior change