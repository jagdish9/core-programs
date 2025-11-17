package programs.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZones {
    public static void main(String[] args) {
        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println(indiaTime);
        System.out.println(newYorkTime);

        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}
