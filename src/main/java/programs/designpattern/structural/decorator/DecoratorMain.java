package programs.designpattern.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Coffee coffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(coffee.getDescription());
    }
}

//Behavior added dynamically