package hello.Message;

import hello.Model.Birthday;
import hello.Model.Name;

public class PersonMessage {

    private NameMessage name;
    private BirthdayMessage birthday;

    public Name getName() {
        return new Name(name.getFirst(), name.getLast());
    }

    public Birthday getBirthday() {
        return new Birthday(birthday.getMonth(), birthday.getDay(), birthday.getYear());
    }

}
