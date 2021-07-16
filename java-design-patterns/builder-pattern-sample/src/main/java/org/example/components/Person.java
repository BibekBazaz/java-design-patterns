package org.example.components;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate dateOfBirth;
    private Contact contact;
    private Address address;
    private IdentityPortfolio identityPortfolio;

    public Person() {
    }

    public Person(String name, LocalDate dateOfBirth, Contact contact, Address address, IdentityPortfolio identityPortfolio) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.contact = contact;
        this.address = address;
        this.identityPortfolio = identityPortfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public IdentityPortfolio getIdentityPortfolio() {
        return identityPortfolio;
    }

    public void setIdentityPortfolio(IdentityPortfolio identityPortfolio) {
        this.identityPortfolio = identityPortfolio;
    }
}
