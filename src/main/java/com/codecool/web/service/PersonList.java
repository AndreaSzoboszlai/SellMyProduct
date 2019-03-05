package com.codecool.web.service;

import com.codecool.web.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    private List<Person> people;

    public PersonList() {
       people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Person> getGreetings() {
        return people;
    }

}
