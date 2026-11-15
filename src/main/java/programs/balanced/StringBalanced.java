package programs.balanced;

public class StringBalanced {
    static void main(String[] args) {
        String s = "1234";

        StringBalanced stringBalanced = new StringBalanced();
        boolean balanced = stringBalanced.isBalanced(s);
        System.out.println(balanced);
    }

    public boolean isBalanced(String num) {
        char[] ch = num.toCharArray();
        int even = 0;
        int odd = 0;
        for(int i = 0; i < ch.length; i++) {
            if((i + 1) % 2 == 0) {
                even += Character.getNumericValue(ch[i]);
            } else {
                odd += Character.getNumericValue(ch[i]);
            }
        }

        System.out.println(even + " " + odd);
        return even == odd;
    }
}
