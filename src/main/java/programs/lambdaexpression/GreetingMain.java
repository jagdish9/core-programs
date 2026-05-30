package programs.lambdaexpression;

public class GreetingMain {
    public static void main(String[] args) {

        //2nd
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };

        g.sayHello();

        //3rd
        Greeting g2 = () -> System.out.println("World!");
        g2.sayHello();
    }
}

//1st
class GreetWithRespect implements Greeting {
    public void sayHello() {
        System.out.println("Hello World!");
    }
}

/*
In three ways we can implement a functional interface
 */