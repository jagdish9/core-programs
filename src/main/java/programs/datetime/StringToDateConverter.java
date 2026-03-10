package programs.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter {
    public static void main(String[] args) {
        String dateString = "29-03-2010";
        String pattern = "dd-MM-yyyy";

        SimpleDateFormat formatter = new SimpleDateFormat(pattern);

        try {
            Date date = formatter.parse(dateString);
            System.out.println("Converted Date: " + date);
        } catch (ParseException e) {
            System.err.println("Error parsing date string: " + e.getMessage());
        }
    }
}
