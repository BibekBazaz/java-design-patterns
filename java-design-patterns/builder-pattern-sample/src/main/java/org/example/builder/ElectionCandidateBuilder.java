package org.example.builder;

import org.example.components.Person;
import org.example.components.Relative;
import org.example.model.Candidate;

import java.util.ArrayList;

public class CandidateBuilder implements Builder{
    private String requestId;
    private Person personInfo;
    private ArrayList<Relative> relatives = new ArrayList<>();

    @Override
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public void setPersonInfo(Person personInfo) {
        this.personInfo=personInfo;

    }

    @Override
    public void setRelatives(ArrayList<Relative> relatives) {
        this.relatives=relatives;
    }

    public Candidate create() {
        return new Candidate(requestId,personInfo,relatives);
    }
}
