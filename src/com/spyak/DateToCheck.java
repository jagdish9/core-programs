package com.spyak;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateToCheck {
    public static void main(String[] args) {
        String dt = "2008-01-01";  // Start date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(dt));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
       // c.add(Calendar.DATE, 5);  // number of days to add
       // String afterDate = sdf.format(c.getTime());  // dt is now the new date

        c.add(Calendar.DATE, -5);  // number of days to add
        String beforeDate = sdf.format(c.getTime());

        System.out.println(dt);
       // System.out.println(afterDate);
        System.out.println(beforeDate);
    }
}
