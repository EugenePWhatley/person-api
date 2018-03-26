package hello.Message;

import hello.Model.Birthday;

public class BirthdayMessage {
    private Integer year;
    private Integer day;
    private Integer month;

    public Birthday getBirthday() {
        return new Birthday(month, day, year);
    }
}
