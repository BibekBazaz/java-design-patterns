package org.example.builder;

import org.example.components.Person;
import org.example.components.Relative;
import org.example.model.ElectionCandidate;
import org.example.model.SchoolCandidate;

import java.util.ArrayList;

public class SchoolCandidateBuilder implements Builder{
    private String requestId;
    private Person personInfo;
    private ArrayList<Relative> relatives = new ArrayList<>();
    private String schoolName;

    @Override
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public void setPersonInfo(Person personInfo) {
        this.personInfo=personInfo;

    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void setRelatives(ArrayList<Relative> relatives) {
        this.relatives=relatives;
    }

    public SchoolCandidate create() {
        return new SchoolCandidate(requestId,personInfo,relatives,schoolName);
    }
}
