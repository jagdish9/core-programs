package programs.streamapi.week;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WeekDayData {
    public static void main(String[] args) {
        List<WeekDay> days = Arrays.asList(
                new WeekDay("FRIDAY", "xyz"),
                new WeekDay("MONDAY", "xyz"),
                new WeekDay("SUNDAY", "xyz"),
                new WeekDay("TUESDAY", "xyz"),
                new WeekDay("WEDNESDAY", "xyz"),
                new WeekDay("THURSDAY", "xyz"),
                new WeekDay("SATURDAY", "xyz"),
                new WeekDay("MONDAY", "xyz"),
                new WeekDay("WEDNESDAY", "xyz")
        );

        days.sort(Comparator.comparing(day -> DayOfWeek.valueOf(day.getDay())));

        days.forEach(day -> System.out.println(day.getDay()));
    }
}

