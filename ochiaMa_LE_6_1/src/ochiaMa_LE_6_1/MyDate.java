package ochiaMa_LE_6_1;

import java.time.LocalDate;
import java.time.ZoneId;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        setDate(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setDate(long elapsedTime) {
        LocalDate localDate = LocalDate.ofInstant(java.time.Instant.ofEpochMilli(elapsedTime), ZoneId.systemDefault());
        this.year = localDate.getYear();
        this.month = localDate.getMonthValue() - 1;
        this.day = localDate.getDayOfMonth();
    }

    @Override
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }
}
