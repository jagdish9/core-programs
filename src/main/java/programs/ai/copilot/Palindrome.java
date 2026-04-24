package programs.ai.copilot;

public class Palindrome {
    public static void main(String[] args) {
        String testString = "A          man, a plan, a canal, Panama";
        boolean result = PalindromeChecker.isPalindrome(testString);
        System.out.println("\"" + testString + "\" is a palindrome: " + result);
    }
}

//create a function that checks if a string is a palindrome
class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}
