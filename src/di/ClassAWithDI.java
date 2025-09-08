package di;

public class ClassAWithDI {
    ClassB classB;

    //constructor injection
    public ClassAWithDI(ClassB classB) {
        this.classB = classB;
    }

    public double tenPercent() {
        return classB.calculate() * 0.1d;
    }
}

//With this approach, we remove the new keyword from our ClassA.
// Thus, we move the responsibility for the creation of ClassB away from ClassA.
// ClassA still has a hard dependency on ClassB but now it can be injected from the outside.
// Now we can inject in ClassA an instance of ClassB or even better class like ClassC.
