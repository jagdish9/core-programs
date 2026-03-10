package programs.datetime;

import java.time.LocalDate;

public class AddAndSubtract {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate plus10Days = today.plusDays(10);
        LocalDate minus5Months = today.minusMonths(5);
        LocalDate nextYear = today.plusYears(1);

        System.out.println(plus10Days);
        System.out.println(minus5Months);
        System.out.println(nextYear);
    }
}
