package programs.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CreateSpecificDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, Month.FEBRUARY, 10);
        LocalTime time = LocalTime.of(12, 30, 35);
        LocalDateTime dateTime = LocalDateTime.of(2024, Month.AUGUST, 25, 10, 35, 55);

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
    }
}
