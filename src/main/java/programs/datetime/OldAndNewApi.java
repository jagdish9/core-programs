package programs.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class OldAndNewApi {
    public static void main(String[] args) {
        Date oldDate = new Date();

        LocalDateTime newDate = oldDate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();

        System.out.println(newDate);

        Date backToOld = Date.from(newDate.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(backToOld);
    }
}
