package hello.Util;

import hello.Builders.PersonTestBuilder;
import hello.Model.Date;
import hello.Model.Person;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SorterTest {

    @Test
    public void sortPeopleByBirthdayMonth() {
        Person person1 = new PersonTestBuilder()
                .withBirthday(new Date(2, 1, 1999))
                .build();
        Person person2 = new PersonTestBuilder()
                .withBirthday(new Date(3, 1, 1999))
                .build();
        Person person3 = new PersonTestBuilder()
                .withBirthday(new Date(1, 1, 1999))
                .build();
        List<Person> people = Arrays.asList(person1, person2, person3);

        List<Person> actual = Sorter.sortByBirthday(people);

        List<Person> expected = Arrays.asList(person3, person1, person2);
        assertThat(actual, Matchers.is(expected));
    }
}