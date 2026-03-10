package programs.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalculateDifferenceBetweenDates {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2025, 1, 1);
        LocalDate end = LocalDate.of(2025, 10, 2);

        Period period = Period.between(start, end);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        long totalDays = ChronoUnit.DAYS.between(start, end);
        long totalMonths = ChronoUnit.MONTHS.between(start, end);
        long totalYears = ChronoUnit.YEARS.between(start, end);
        System.out.println(totalDays);
        System.out.println(totalMonths);
        System.out.println(totalYears);
    }
}
