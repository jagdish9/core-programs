package programs.soliddesignprinciples.interfacesegregationprinciple.problem;

public interface Worker {
    void work();
    void eat();
}

class Human implements Worker {
    public void work() {
    }

    public void eat() {
    }
}

class Robot implements Worker {
    public void work() {
    }

    public void eat() {
        throw new UnsupportedOperationException();
    }
}

/*
In Robot class we are throwing for eat method which is a bad design
 */


