package hello.Message;

import hello.Model.Birthday;
import hello.Model.Name;

public class PersonMessage {

    private NameMessage name;
    private BirthdayMessage birthday;

    public Name getName() {
        return name.getName();
    }

    public Birthday getBirthday() {
        return birthday.getBirthday();
    }
}
