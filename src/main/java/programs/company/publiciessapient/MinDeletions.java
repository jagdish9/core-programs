package programs.company.publiciessapient;

public class MinDeletions {
    public static void main(String[] args) {
        String s = "BAAABAB";

        int minDeletions = getMinDeletions(s);

        System.out.print(minDeletions);
    }

    private static int getMinDeletions(String s) {
        int bCount = 0;
        int deletions = 0;

        for(char c : s.toCharArray()) {
            if(c == 'A') {
                // Either delete this A or delete previous B's
                deletions = Math.min(deletions + 1, bCount);
            } else {
                bCount++;
            }
        }

        return deletions;
    }
}

/*
minimum deletions so that the string becomes:

All A's first, then all B's
i.e. AAAA...BBBB (no BA pattern allowed)
 */