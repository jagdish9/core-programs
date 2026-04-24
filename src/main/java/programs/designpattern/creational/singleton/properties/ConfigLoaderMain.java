package programs.designpattern.creational.singleton.properties;

public class ConfigLoaderMain {
    public static void main(String[] args) {
        ConfigLoader config = ConfigLoader.getInstance();

        System.out.println(config.getProperty("app.name"));
        System.out.println(config.getProperty("db.url"));
    }
}
