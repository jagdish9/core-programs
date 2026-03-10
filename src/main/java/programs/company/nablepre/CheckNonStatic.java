package programs.company.nablepre;

public class CheckNonStatic {
    public static void main(String[] args) {
        CheckNonStatic checkNonStatic = new CheckNonStatic();
        System.out.println(checkNonStatic.concatText("Hello"));
        System.out.println(CheckNonStatic.concatText2("Hello"));
    }

    public String concatText(String s) {
        return s + "-" + s;
    }

    public static String concatText2(String s) {
        return s + ":" + s;
    }
}
