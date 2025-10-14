package programs.turing;

public class CountTotalConsecutiveSubstring {
    public static void main(String[] args) {
        String word = "jameskakaiwartjkametka";
        String sub = "ka";

        int count = getTotalConsecutiveSubStringCount(word, sub);
        System.out.println(count);
    }

    private static int getTotalConsecutiveSubStringCount(String word, String sub) {
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

            if(count == bLen) {
                for(int l = i+count; l < i+count+bLen; l++) {
                    count = 0;
                    for (int k = 0; k < bLen; k++) {
                        if (word.charAt(l + k) != sub.charAt(k))
                            break;

                        count++;
                    }
                    if(count == bLen) {
                        totalCount++;
                    }
                }
            }
        }

        return totalCount;
    }
}
