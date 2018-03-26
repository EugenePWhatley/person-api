package hello.Model;

import hello.Builders.PersonTestBuilder;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class PersonTest {

    @Test
    public void shouldReturnOlderPerson() throws Exception {
        Person younger = new PersonTestBuilder()
                .withBirthday(new Birthday(1, 2, 1994))
                .build();
        Person older = new PersonTestBuilder()
                .withBirthday(new Birthday(2, 2, 1995))
                .build();

        Person actual = younger.older(older);

        assertThat(actual, Matchers.is(older));
    }

}