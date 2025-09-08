package di;

public class ClassA {

    ClassB classB = new ClassB();

    public double tenPercent() {
        return classB.calculate() * 0.1d;
    }
}

/*
Now, there is a problem with this approach which is if we needed to change/replace
ClassB with ClassC because ClassC has an optimized version of the calculate() method,
we need to recompile ClassA because we don't have a way to change that dependency,
it's hardcoded inside of ClassA.
 */