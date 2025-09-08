package com.spyak;

public class IncreaseDate {

    public static void main(String[] args) {
        String s1 = "2017-10-17";
        String[] dateAttributes = s1.split("-");
        int day = 0;
        if(dateAttributes.length == 3) {
            day = Integer.parseInt(dateAttributes[2]);
            if(day <= 23) {
                day = day + 5;
            }
        }
        String beforeDate = dateAttributes[0] + "-" + dateAttributes[1] + "-" + day;
        System.out.println(s1);
        System.out.println(beforeDate);
    }
}
