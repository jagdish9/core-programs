package programs.character;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "Too hot to hoot.";
        boolean palindrome = isPalindrome(input);
        System.out.println(palindrome);
    }

    private static boolean isPalindrome(String input) {
        int len = input.length();
        int j = len - 1;
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(!Character.isLetter(input.charAt(i)) || !Character.isLetter(input.charAt(j))) {
                continue;
            }
            if(String.valueOf(input.charAt(i)).equalsIgnoreCase(String.valueOf(input.charAt(j)))) {
                count++;
            } else {
                break;
            }
            j--;
        }
        return len == count;
    }
}
