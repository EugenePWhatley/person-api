package hello.Util;

import hello.Model.Person;

import java.util.Comparator;
import java.util.List;

public class Sorter {

    public static List<Person> sortByBirthday(List<Person> people) {
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                Person older = o1.older(o2);
                if (older == o1 && older == o2) {
                    return 0;
                } else if (older == o1) {
                    return 1;
                } else if (older == o2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return people;
    }
}
