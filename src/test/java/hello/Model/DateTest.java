package hello.Model;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    @Test
    public void shouldReturnLatestMonth() {
        Date earlier = new Date(1, 1, 1990);
        Date later = new Date(2, 1, 1990);

        Date actual = earlier.max(later);

        assertThat(actual, Matchers.is(later));
    }

    @Test
    public void shouldReturnLatestYear() {
        Date earlier = new Date(1, 1, 1990);
        Date later = new Date(1, 1, 1992);

        Date actual = earlier.max(later);

        assertThat(actual, Matchers.is(later));
    }

    @Test
    public void shouldReturnLatestDate() {
        Date earlier = new Date(1, 1, 1990);
        Date later = new Date(1, 3, 1990);

        Date actual = earlier.max(later);

        assertThat(actual, Matchers.is(later));
    }

    @Test
    public void shouldReturnLatestBirthday() {
        Date earlier = new Date(4, 20, 1990);
        Date later = new Date(1, 3, 1992);

        Date actual = earlier.max(later);

        assertThat(actual, Matchers.is(later));
    }

}