package programs.designpattern.structural.proxy;

public class RealInternet implements Internet {

    public void connect(String site) {
        System.out.println("Connecting to "+ site);
    }
}
