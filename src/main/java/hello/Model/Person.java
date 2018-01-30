package hello.Model;

import java.util.UUID;

public class Person {

    private UUID id;
    private final Name name;
    private final Birthday birthday;

    public Person(UUID id, Name name, Birthday birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public UUID getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    public Birthday getBirthday() {
        return birthday;
    }
}
