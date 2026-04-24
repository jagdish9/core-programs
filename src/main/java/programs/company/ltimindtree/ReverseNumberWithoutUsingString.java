package programs.company.ltimindtree;

public class ReverseNumberWithoutUsingString {
    public static void main(String[] args) {
        int no = 1562;

        int reverseNo = getReverseNo(no);
        System.out.println(reverseNo);
    }

    private static int getReverseNo(int no) {
        int reverse = 0;
        while (no != 0) {
            int digit = no % 10;
            reverse = reverse * 10 + digit;
            no = no / 10;
        }

        return reverse;
    }
}
