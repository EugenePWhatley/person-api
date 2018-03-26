package hello.Model;

import jdk.nashorn.internal.ir.annotations.Immutable;
import java.util.UUID;

@Immutable
public class Person {

    private final UUID id;
    private final Name name;

    private final Date birthday;

    public Person(UUID id, Name name, Date birthday) {
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

    public Date getBirthday() {
        return birthday;
    }

    public Person older(Person person) {
        Date currentBirthday = this.getBirthday();
        Date comparedBirthday = person.getBirthday();
        if (currentBirthday.later(comparedBirthday) == comparedBirthday) {
            return person;
        }
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name=" + name +
                ", birthday=" + birthday +
                '}';
    }
}
