package hello.Model;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DateTest {

    @Test
    public void shouldReturnLatestMonth() {
        Date earlier = new Date(1, 30, 1990);
        Date later = new Date(2, 1, 1990);

        Date actual = earlier.later(later);

        assertThat(actual, is(later));
    }

    @Test
    public void shouldReturnLatestYear() {
        Date earlier = new Date(5, 23, 1990);
        Date later = new Date(3, 1, 1992);

        Date actual = later.later(earlier);

        assertThat(actual, is(later));
    }

    @Test
    public void shouldReturnLatestDate() {
        Date earlier = new Date(1, 1, 1990);
        Date later = new Date(1, 3, 1990);

        Date actual = earlier.later(later);

        assertThat(actual, is(later));
    }

    @Test
    public void shouldConsiderDatesSameIfSameYearDayAndMonth() {
        Date earlier = new Date(1, 1, 1990);
        Date later = new Date(1, 1, 1990);

        assertThat(earlier.equals(later), is(true));
    }

    @Test
    public void shouldPrettyPrintDate() {
        String output = new Date(6, 18, 1993).toString();

        assertThat(output, is("6-18-1993"));
    }
}