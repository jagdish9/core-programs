package programs.datetime;

import java.time.Duration;
import java.time.Instant;

public class InstantAndDuration {
    public static void main(String[] args) {
        Instant start = Instant.now();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);
        System.out.println(duration.toMillis());
    }
}
