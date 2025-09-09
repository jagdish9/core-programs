package programs.yaml;

public class CheckSplitFun {

    public static void main(String[] args) {
        String s1 = "<Copyright>Copyright © Rich Hickey and contributors 2023</Copyright>";
        s1 = s1.replace("<", "").replace(">", "")
                .replace("/", "");
        String[] s = s1.split("Copyright");
        System.out.println(s);
    }
}
