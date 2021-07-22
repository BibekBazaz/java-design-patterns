package org.example.model;

import org.example.components.Person;
import org.example.components.Relative;

import java.util.ArrayList;

public class Candidate {

    private String requestId;
    private Person personInfo;
    private ArrayList<Relative> relatives = new ArrayList<>();

    public Candidate(String requestId, Person personInfo, ArrayList<Relative> relatives) {
        this.requestId = requestId;
        this.personInfo = personInfo;
        this.relatives = relatives;
    }

    public String getRequestId() {
        return requestId;
    }

    public Person getPersonInfo() {
        return personInfo;
    }

    public ArrayList<Relative> getRelatives() {
        return relatives;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "requestId='" + requestId + '\'' +
                ", personInfo=" + personInfo +
                ", relatives=" + relatives +
                '}';
    }
}
