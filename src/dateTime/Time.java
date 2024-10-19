package dateTime;

public class Time {
    private int hour;
    private int minutes;
    private int seconds;

    public Time(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int gethour() {
        return hour;
    }

    public void sethour(int hour) {
        this.hour = hour;
    }

    public int getminutes() {
        return minutes;
    }

    public void setminutes(int minutes) {
        this.minutes = minutes;
    }

    public int getseconds() {
        return seconds;
    }

    public void setseconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minutes, seconds);
    }

}