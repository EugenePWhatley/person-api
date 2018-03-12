package hello.Builders;

import hello.Model.Date;
import hello.Model.Name;
import hello.Model.Person;

import java.util.UUID;

public class PersonTestBuilder {
    private UUID id = UUID.randomUUID();
    private Name name = new Name("dnioasndoas", "noifnf");
    private Date birthday = new Date(5,30,1848);

    public PersonTestBuilder withBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public Person build() {
        return new Person(id, name, birthday);
    }
}
