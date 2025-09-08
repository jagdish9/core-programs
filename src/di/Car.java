package di;

public class Car {
    private Engine engine;

    //@Autowired
    public Car(Engine engine) {
        this.engine = engine;
    }
}

//https://medium.com/@harshc0707/dependency-injection-and-inversion-of-control-ioc-in-java-58a78f492b11
