package prog;

public class CheckMagicNumber {
    public static void main(String[] args) {
        //int number = 2478943;
        int number = 24789432;

        boolean magicNumber = checkMagicNumber(number);

        if(magicNumber) {
            System.out.println("magic number");
        } else {
            System.out.println("not a magic number");
        }
    }

    public static boolean checkMagicNumber(int number) {
        int sum = 0;
        while (number > 0) {
            int remainder = number % 10;
            sum += remainder;
            number /= 10;
        }

        if(sum > 9)
            return checkMagicNumber(sum);

       return sum == 1;
    }
}

/*
Write a Java Program to check if any number is a magic number or not.
 A number is said to be a magic number if after doing sum of digits in each step
 and inturn doing sum of digits of that sum,
the ultimate result (when there is only one digit left) is 1.

2025 = 9
2025 / 10 = 202 = 20 = 2
2025 % 10 = 5
202 % 10 = 2
2 % 10 = 2

 */
