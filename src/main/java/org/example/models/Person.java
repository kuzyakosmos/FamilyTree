package org.example.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private LocalDate dateOfBirth;
    private LocalDate dateOfDeath;
    private boolean alive;
    private int momId;
    private int dadId;
}
