package programs.soliddesignprinciples.liskovsubstitutionprinciple.problem;

public class Bird {
    public void fly() {
        System.out.println("flying");
    }
}

class Sparrow extends Bird {

}

class Penguin extends Bird {
    public void fly() {
        throw new UnsupportedOperationException();
    }
}

/*
Penguin can not fly, we are throwing unsupported operation exception which is bad design
 */