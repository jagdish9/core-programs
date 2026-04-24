package programs.company.publiciessapient;

public class GetLargetBinaryGap {
    public static void main(String[] args) {
        int n = 1041;

        int gap = getLargetGap(n);
        System.out.print(gap);
    }

    private static int getLargetGap(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        int maxCount = 0;

        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '0') {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }

        return maxCount;
    }
}
