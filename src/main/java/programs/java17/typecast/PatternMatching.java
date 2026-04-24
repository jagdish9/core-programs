package programs.java17.typecast;

public class PatternMatching {
    public static void main(String[] args) {
        String s = new String("abc");

        //before java 17
        if(s instanceof String) {
            String str = (String) s;
            System.out.println(str);
        }

        //Java 17
        /*if(s instanceof String str) {
            System.out.println(str);
        }*/
    }
}

/*
Benefit
No manual casting
Cleaner and less error-prone
 */
