package hello.Model;

import org.joda.time.DateTime;
import org.joda.time.IllegalFieldValueException;

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
            if (new DateTime(year, month, day, 0, 0).isAfterNow())
                throw new IllegalArgumentException("Birthday must be in past");
        } catch (IllegalFieldValueException exception) {
            throw new IllegalArgumentException(exception.getMessage());
        }
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public Date max(Date date) {
        if (date.getMonth() > this.getMonth())
            return date;
        if (date.getYear() > this.getYear())
            return date;
        if (date.getDay() > this.getDay())
            return date;
        return this;
    }


    @Override
    public String toString() {
        return "Date{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}