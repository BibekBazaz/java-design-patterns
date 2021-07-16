package org.example.model;

import org.example.components.Person;
import org.example.components.Relative;

import java.util.ArrayList;

public class Candidate {

    private String requestId;
    private Person personInfo;
    private ArrayList<Relative> relatives = new ArrayList<>();

    public Candidate() {
    }

    public Candidate(String requestId, Person personInfo, ArrayList<Relative> relatives) {
        this.requestId = requestId;
        this.personInfo = personInfo;
        this.relatives = relatives;
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
