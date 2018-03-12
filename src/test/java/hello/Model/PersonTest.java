package hello.Model;

import hello.Builders.PersonTestBuilder;
import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void shouldReturnOlderPerson() throws Exception {
        Person younger = new PersonTestBuilder()
                .withBirthday(new Date(1, 2, 1994))
                .build();
        Person older = new PersonTestBuilder()
                .withBirthday(new Date(2, 2, 1995))
                .build();

        Person actual = younger.older(older);

        assertThat(actual, Matchers.is(older));
    }

}