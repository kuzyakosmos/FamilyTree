package org.example;

import org.example.models.Person;
import org.example.services.PersonService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person person = new Person();
        personService.savePerson(person);
    }
}
