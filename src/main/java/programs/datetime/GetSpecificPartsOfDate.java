package programs.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class GetSpecificPartsOfDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        int day = date.getDayOfMonth();
        Month month = date.getMonth();
        int year = date.getYear();

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println(day + " "+ month + " "+ year + " "+ dayOfWeek);
    }
}
