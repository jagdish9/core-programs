package programs.designpattern.creational.singleton.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

    private static ConfigLoader instance;

    private Properties properties;

    private ConfigLoader() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load properties file", e);
        }
    }

    public static ConfigLoader getInstance() {
        if(instance == null) {
            synchronized (ConfigLoader.class) {
                if(instance == null) {
                    instance = new ConfigLoader();
                }
            }
        }
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
