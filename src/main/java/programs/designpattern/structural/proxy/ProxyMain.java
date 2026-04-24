package programs.designpattern.structural.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        internet.connect("google.com");
        internet.connect("blocked.com");
    }
}

//Adds control/security
