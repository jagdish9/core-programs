package programs.java8.moreadvanced;

public class FindSumOfDigitsInNumbers {
    public static void main(String[] args) {
        int num = 12345;

        int sum = String.valueOf(num).chars()
                .map(c -> Character.getNumericValue(c))
                .sum();

        System.out.println(sum);
    }
}
