package programs.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("date: "+ date);
        System.out.println("time: "+ time);
        System.out.println("dateTime: "+ dateTime);
    }
}

/*
These classes are immutable — every modification returns a new object.

Java 8 introduced the new Date and Time API in the package
java.time — which is immutable, thread-safe, and far superior to
the old Date, Calendar, and SimpleDateFormat classes.
 */
