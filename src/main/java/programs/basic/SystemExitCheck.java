package programs.basic;

public class SystemExitCheck {
    public static void main(String[] args) {
        try {
            System.exit(0);
            throw new Exception("Exception Message");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
