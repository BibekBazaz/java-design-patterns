package org.example.model;

import org.example.components.Person;
import org.example.components.Relative;

import java.util.ArrayList;

public class ElectionCandidate {

    private String requestId;
    private Person personInfo;
    private ArrayList<Relative> relatives = new ArrayList<>();
    //additional parameter
    private String electionCampaignState;

    public ElectionCandidate(String requestId, Person personInfo, ArrayList<Relative> relatives, String electionCampaignState) {
        this.requestId = requestId;
        this.personInfo = personInfo;
        this.relatives = relatives;
        this.electionCampaignState = electionCampaignState;
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

    public String getElectionCampaignState() {
        return electionCampaignState;
    }


    @Override
    public String toString() {
        return "ElectionCandidate{" +
                "requestId='" + requestId + '\'' +
                ", personInfo=" + personInfo +
                ", relatives=" + relatives.toString() +
                ", electionCampaignState='" + electionCampaignState + '\'' +
                '}';
    }
}
