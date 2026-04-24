package programs.designpattern.creational.singleton.database;

public class DatabaseConnection {

    private static DatabaseConnection instance = null;

    private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        if(instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
