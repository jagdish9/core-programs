package programs.designpattern.structural.proxy;

public class ProxyInternet implements Internet {

    private RealInternet internet = new RealInternet();

    public void connect(String site) {
        if(site.equals("blocked.com")) {
            System.out.println("Access Denied");
        } else {
            internet.connect(site);
        }
    }
}
