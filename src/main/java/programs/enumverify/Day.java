package programs.enumverify;

public enum Day {
    SUNDAY(1), MONDAY(2), TUESDAY(3);

    private final int dayNumber;

    Day(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return dayNumber;
    }
}
