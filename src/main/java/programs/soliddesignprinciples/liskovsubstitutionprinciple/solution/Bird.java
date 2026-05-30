package programs.soliddesignprinciples.liskovsubstitutionprinciple.solution;

public class Bird {
}

interface Flyable {
    void fly();
}

class Sparrow extends Bird implements Flyable {
    public void fly() {

    }
}

class Penguin extends Bird {

}

/*
We can see here, we don't need to implement flyable which is a good design
 */
