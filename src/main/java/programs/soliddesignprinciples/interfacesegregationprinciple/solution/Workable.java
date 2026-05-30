package programs.soliddesignprinciples.interfacesegregationprinciple.solution;

public interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() {
    }

    public void eat() {
    }
}

class Robot implements Workable {
    public void work() {
    }
}

/*
Here we can see we don't need to implement eat method
 */

