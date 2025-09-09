package programs.spyak;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateCheck {
    public static void main(String[] args) {
        /*String strDate = "12-8-16";
        System.out.println(convertDateToString(convertStringToDate(strDate)));

        String s1 = "https://github.com/rails/jbuilder/tree/v2.11.5?tab=readme-ov-file";
        if(s1.contains("?tab")) {
            String[] str = s1.split("\\?tab");
            System.out.println(str[0]);
        }*/

        String s1Date = "14-12-2020";
        System.out.println(convertStringToDateForCsvLoading(s1Date, "dd-MM-yyyy"));
    }

    public static String convertDateToString(Date date) {
        String dateString = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yy");
        try {
            dateString = simpleDateFormat.format(date);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dateString;
    }

    public static Date convertStringToDate(String dob) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yy");
        Date date = null;
        try {
            date = formatter.parse(dob);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return date;
    }

    public static Date convertStringToDateForCsvLoading(String dob, String format) {
        String[] dateFormats = dob.split("-");
        /*String datePattern = null;
        int digitCount = calculateDigits(dateFormats[dateFormats.length-1]);
        if(digitCount == 2) {
            datePattern = "MM-dd-yy";
        }
        else if(digitCount == 4) {
            datePattern = "MM-dd-yyyy";
        }*/
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = formatter.parse(dob);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return date;
    }

    private static int calculateDigits(String dateYear) {
        int digitCount = 0;
        for(int i = 0; i < dateYear.length(); i++) {
            digitCount++;
        }
        return digitCount;
    }
}
