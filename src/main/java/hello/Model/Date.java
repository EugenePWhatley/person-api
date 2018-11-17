package hello.Model;

import jdk.nashorn.internal.ir.annotations.Immutable;
import org.joda.time.DateTime;
import org.joda.time.IllegalFieldValueException;

@Immutable
public class Date {
    private final Integer month;
    private final Integer day;
    private final Integer year;

    public Date(Integer month, Integer day, Integer year) {
        validate(month, day, year);
        this.month = month;
        this.day = day;
        this.year = year;
    }

    private void validate(Integer month, Integer day, Integer year) {
        try {
            new DateTime(year, month, day, 0, 0);
        } catch (IllegalFieldValueException exception) {
            throw new IllegalArgumentException(exception.getMessage());
        }
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getYear() {
        return year;
    }

    public Date later(Date date) {
        int later = this.compareTo(date);
        if (later == 1) {
            return this;
        } else {
            return date;
        }
    }

    private int compareTo(Date date) {
        int laterYear = this.getYear().compareTo(date.getYear());
        int laterMonth = this.getMonth().compareTo(date.getMonth());
        int laterDay = this.getDay().compareTo(date.getDay());

        if (laterYear == 1 || laterYear == 0 && laterMonth == 1 || laterYear == 0 && laterMonth == 0 && laterDay == 1) {
            return 1;
        } else if (laterYear == 0 && laterMonth == 0 && laterDay == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Date date = (Date) o;

        if (month != null ? !month.equals(date.month) : date.month != null) return false;
        if (day != null ? !day.equals(date.day) : date.day != null) return false;
        return year != null ? year.equals(date.year) : date.year == null;
    }

    @Override
    public int hashCode() {
        int result = month != null ? month.hashCode() : 0;
        result = 31 * result + (day != null ? day.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return month + "-" + day + "-" + year;
    }
}