package org.example.components;

import java.time.LocalDate;

public class Relative extends Person{

    private String relation = new String();

    public Relative(String relation) {
        this.relation = relation;
    }

    public Relative(String name, LocalDate dateOfBirth, Contact contact, Address address, IdentityPortfolio identityPortfolio, String relation) {
        super(name, dateOfBirth, contact, address, identityPortfolio);
        this.relation = relation;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }
}
