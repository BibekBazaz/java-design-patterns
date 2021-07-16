package org.example.directors;

import org.example.builder.CandidateBuilder;
import org.example.components.Contact;
import org.example.components.Person;
import org.example.model.Candidate;
import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.UUID;

public class Director {

    public Candidate createCandidate(){
        CandidateBuilder candidateBuilder = new CandidateBuilder();
        candidateBuilder.setRequestId(UUID.randomUUID().toString());
        Person person = new Person();
        person.setName("Bibek");
        person.setDateOfBirth(LocalDate.now());
        Contact contact = new Contact();
        contact.setEmailAddress("bibekkumar.bazaz.com");
        person.setContact(contact);
        candidateBuilder.setPersonInfo(person);
        return candidateBuilder.create();
    }
}
