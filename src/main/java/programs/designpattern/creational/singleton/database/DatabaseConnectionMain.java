package programs.designpattern.creational.singleton.database;

public class DatabaseConnectionMain {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        if(db1 == db2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

// Same object reused
