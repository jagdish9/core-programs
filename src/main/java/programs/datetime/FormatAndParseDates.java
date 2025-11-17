package programs.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatAndParseDates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String formatted = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(formatted);

        String input = "2025/11/07";
        LocalDate parsed = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(parsed);
    }
}
