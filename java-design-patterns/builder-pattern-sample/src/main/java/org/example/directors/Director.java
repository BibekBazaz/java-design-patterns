package org.example.directors;

import org.example.builder.Builder;
import org.example.builder.ElectionCandidateBuilder;
import org.example.components.Contact;
import org.example.components.Person;
import org.example.model.ElectionCandidate;

import java.time.LocalDate;
import java.util.UUID;

public class Director {

    public void createElectionCandidate(Builder builder){
        builder.setRequestId(UUID.randomUUID().toString());
        Person person = new Person();
        person.setName("Bibek");
        person.setDateOfBirth(LocalDate.now());
        Contact contact = new Contact();
        contact.setEmailAddress("bibekkumar.bazaz.com");
        person.setContact(contact);
        builder.setPersonInfo(person);
    }

    public void createSchoolCandidate(Builder builder){
        builder.setRequestId(UUID.randomUUID().toString());
        Person person = new Person();
        person.setName("Bibek");
        person.setDateOfBirth(LocalDate.now());
        Contact contact = new Contact();
        contact.setEmailAddress("bibekkumar.bazaz.com");
        person.setContact(contact);
        builder.setPersonInfo(person);
    }
}
