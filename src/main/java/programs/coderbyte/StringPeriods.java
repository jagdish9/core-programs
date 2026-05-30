package programs.coderbyte;

public class StringPeriods {
    public static void main(String[] args) {
        //String input = "abcabcabcabc";
        //String input = "aaaaaa";
        String input = "abcd";
        String result = stringPeriods(input);
        System.out.println(result);
    }

    private static String stringPeriods(String input) {
        int n = input.length();

        //Try all possible substring length
        for(int len = 1; len <= n/2; len++) {

            //length must divide string fully
            if(n % len != 0) continue;

            String sub = input.substring(0, len);

            StringBuilder sb = new StringBuilder();

            int repeat = n / len;

            for(int i = 0; i < repeat; i++) {
                sb.append(sub);
            }

            if(sb.toString().equals(input)) {
                return sub;
            }
        }

        return "-1"; //No repeating pattern
    }
}
