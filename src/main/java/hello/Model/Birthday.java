package hello.Model;

import jdk.nashorn.internal.ir.annotations.Immutable;
import org.joda.time.DateTime;
import org.joda.time.IllegalFieldValueException;

@Immutable
public class Birthday extends Date {
    public Birthday(Integer month, Integer day, Integer year) {
        super(month, day, year);
        try {
            if (new DateTime(year, month, day, 0, 0).isAfterNow())
                throw new IllegalArgumentException("Birthday must be in the past");
        } catch (IllegalFieldValueException exception) {
            throw new IllegalArgumentException(exception.getMessage());
        }
    }
}
