package hello.Message;

import hello.Model.Date;
import hello.Model.Name;

public class PersonMessage {

    private NameMessage name;
    private DateMessage birthday;

    public Name getName() {
        return new Name(name.getFirst(), name.getLast());
    }

    public Date getBirthday() {
        return new Date(birthday.getMonth(), birthday.getDay(), birthday.getYear());
    }

}
