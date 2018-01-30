package hello.Controller;

import hello.Message.PersonMessage;
import hello.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

@RestController()
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity createPerson(@RequestBody PersonMessage personMessage) throws URISyntaxException {
        return ResponseEntity
                .created(new URI("/persons/" + personService.create(personMessage).toString()))
                .build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getPersons() {
        return ResponseEntity.ok(personService.getAll());
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getPerson(@PathVariable UUID id) {
        return ResponseEntity.ok(personService.get(id));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity removePerson(@PathVariable UUID id) {
        return ResponseEntity.ok(personService.remove(id));
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity updatePerson(@PathVariable UUID id, @RequestBody PersonMessage personMessage) {
        return ResponseEntity.ok(personService.update(id, personMessage));
    }
}
