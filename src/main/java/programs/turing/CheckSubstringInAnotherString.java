package programs.turing;

public class CheckSubstringInAnotherString {
    public static void main(String[] args) {
        String word = "jameskaiwartjkamet";
        String sub = "ka";

        int count = getSubStringCount(word, sub);
        System.out.println(count);
    }

    private static int getSubStringCount(String word, String sub) {
        int aLen = word.length();
        int bLen = sub.length();

        for(int i = 0; i < aLen - bLen; i++) {
            int count = 0;
            for(int j = 0; j < bLen; j++) {
                if(word.charAt(i+j) != sub.charAt(j))
                    break;

                count++;
            }

            if(count == bLen)
                return i;
        }

        return -1;
    }
}
