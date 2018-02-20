package hello.Service;

import hello.Message.PersonMessage;
import hello.Model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PersonService {

    private List<Person> persons = new ArrayList<>();

    public UUID create(PersonMessage personMessage) {
        UUID id = UUID.randomUUID();
        persons.add(new Person(id, personMessage.getName(), personMessage.getBirthday()));
        return id;
    }

    public List<Person> getAll() {
        return persons;
    }

    public Person get(UUID id) {
        for (Person person : persons) {
            if (id.equals(person.getId())) {
                return person;
            }
        }
        return null;
    }

    public Person remove(UUID id) {
        Person person = get(id);
        persons.remove(person);
        return person;
    }

    public Person update(UUID id, PersonMessage personMessage) {
        Person person = remove(id);
        persons.add(new Person(id, personMessage.getName(), person.getBirthday()));
        return get(id);
    }
}
