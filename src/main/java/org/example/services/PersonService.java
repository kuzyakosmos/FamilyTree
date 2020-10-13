package org.example.services;

import org.example.dao.PersonDao;
import org.example.models.Person;

public class PersonService {
    private PersonDao personsDao = new PersonDao();

    public PersonService() {
    }

    public Person findPerson(int id) {
        return personsDao.findById(id);
    }

    public void savePerson(Person person) {
        personsDao.save(person);
    }

    public void deletePerson(Person person) {
        personsDao.delete(person);
    }

    public void updatePerson(Person person) {
        personsDao.update(person);
    }
}
