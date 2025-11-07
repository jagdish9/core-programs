package programs.turing;

public class CountTotalSubstring {
    public static void main(String[] args) {
        String word = "jameskaiwartjkamet";
        String sub = "ka";

        int count = getTotalSubStringCount(word, sub);
        System.out.println(count);
    }

    private static int getTotalSubStringCount(String word, String sub) {
        int aLen = word.length();
        int bLen = sub.length();

        int totalCount = 0;

        for(int i = 0; i < aLen - bLen; i++) {
            int count = 0;
            for(int j = 0; j < bLen; j++) {
                if(word.charAt(i+j) != sub.charAt(j))
                    break;

                count++;
            }

            if(count == bLen)
                totalCount++;
        }

        return totalCount;
    }
}
