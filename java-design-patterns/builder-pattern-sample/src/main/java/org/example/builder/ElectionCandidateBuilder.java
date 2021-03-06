package org.example.builder;

import org.example.components.Person;
import org.example.components.Relative;
import org.example.model.ElectionCandidate;

import java.util.ArrayList;

public class ElectionCandidateBuilder implements Builder{
    private String requestId;
    private Person personInfo;
    private ArrayList<Relative> relatives = new ArrayList<>();
    private String electionCampaignState;

    @Override
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public void setPersonInfo(Person personInfo) {
        this.personInfo=personInfo;

    }
    public void setElectionCampaignState(String electionCampaignState) {
        this.electionCampaignState = electionCampaignState;
    }

    @Override
    public void setRelatives(ArrayList<Relative> relatives) {
        this.relatives=relatives;
    }

    public ElectionCandidate create() {
        return new ElectionCandidate(requestId,personInfo,relatives,electionCampaignState);
    }
}
