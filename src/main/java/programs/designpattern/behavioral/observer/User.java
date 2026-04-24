package programs.designpattern.behavioral.observer;

public class User implements Observer {

    public void update(String message) {
        System.out.println("Received: "+ message);
    }
}
