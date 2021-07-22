package org.example.model;

import org.example.components.Person;
import org.example.components.Relative;

import java.util.ArrayList;

public class SchoolCandidate {

    private String requestId;
    private Person personInfo;
    private ArrayList<Relative> relatives = new ArrayList<>();
    //additional config
    private String schoolName;

    public SchoolCandidate(String requestId, Person personInfo, ArrayList<Relative> relatives, String schoolName) {
        this.requestId = requestId;
        this.personInfo = personInfo;
        this.relatives = relatives;
        this.schoolName = schoolName;
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

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "SchoolCandidate{" +
                "requestId='" + requestId + '\'' +
                ", personInfo=" + personInfo +
                ", relatives=" + relatives.toString() +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
