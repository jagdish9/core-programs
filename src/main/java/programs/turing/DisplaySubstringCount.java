package programs.turing;

public class DisplaySubstringCount {
    public static void main(String[] args) {
        String word = "popohgkpo";
        String searchStr = "po";

        int count = getSubstringCount(word, searchStr);
        System.out.println(count);
    }

    private static int getSubstringCount(String word, String searchStr) {
        int lenA = word.length();
        int lenB = searchStr.length();
        int count = 0;

        for(int i = 0; i < lenA - lenB; i++) {
            String c = word.substring(i, lenB);
            String d = word.substring(lenB+i, lenB+lenB);
            if(c.equalsIgnoreCase(d) && c.equalsIgnoreCase(searchStr)) {
                count += 1;
            }
        }

        return count;
    }
}
