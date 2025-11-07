package programs.streamapi.week;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DayOfWeekSort {
    public static void main(String[] args) {
        List<DayOfWeek> days = new ArrayList<>();
        days.add(DayOfWeek.FRIDAY);
        days.add(DayOfWeek.SATURDAY);
        days.add(DayOfWeek.MONDAY);
        days.add(DayOfWeek.WEDNESDAY);
        days.add(DayOfWeek.TUESDAY);
        days.add(DayOfWeek.THURSDAY);
        days.add(DayOfWeek.SUNDAY);
        days.add(DayOfWeek.FRIDAY);
        System.out.println("Before sorting: "+ days);
        Collections.sort(days);
        System.out.println();
        System.out.println("After sorting: "+days);
    }
}
