package br.otymus.testes.tdd;

import java.util.concurrent.atomic.AtomicLong;

public class PersonService implements IPersonService {

    @Override
    public Person createPerson(Person person) {
        var id = new AtomicLong().incrementAndGet();
        person.setId(id);

        if (person.getEmail() == null || person.getEmail().isBlank()) {
            throw new IllegalArgumentException("E-mail is null or empty!");
        }

        return person;
    }
}
