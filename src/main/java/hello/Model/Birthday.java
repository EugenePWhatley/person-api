package hello.Model;

import org.joda.time.DateTime;
import org.joda.time.IllegalFieldValueException;

public class Birthday {
    private final Integer month;
    private final Integer day;
    private final Integer year;

    public Birthday(Integer month, Integer day, Integer year) {
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
}