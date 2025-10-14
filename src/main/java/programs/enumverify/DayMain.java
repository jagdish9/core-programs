package programs.enumverify;

public class DayMain {
    public static void main(String[] args) {
        System.out.println(Day.SUNDAY);
        System.out.println(Day.SUNDAY.getDayNumber());
        System.out.println(Day.SUNDAY.name());
        System.out.println(Day.SUNDAY.ordinal());

        System.out.println();

        System.out.println(Day.TUESDAY);
        System.out.println(Day.TUESDAY.getDayNumber());
        System.out.println(Day.TUESDAY.name());
        System.out.println(Day.TUESDAY.ordinal());
    }
}
