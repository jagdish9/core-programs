package programs.datetime;

import java.time.LocalDate;

public class CompareDates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate future = LocalDate.of(2025, 10, 10);

        System.out.println(today.isBefore(future));
        System.out.println(today.isAfter(future));
        System.out.println(today.isEqual(future));
    }
}
