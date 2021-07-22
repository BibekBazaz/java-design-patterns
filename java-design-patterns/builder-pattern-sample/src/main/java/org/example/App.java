package org.example;

import org.example.builder.ElectionCandidateBuilder;
import org.example.builder.SchoolCandidateBuilder;
import org.example.directors.Director;
import org.example.model.ElectionCandidate;
import org.example.model.SchoolCandidate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Director director = new Director();

        //Building School Candidate
        SchoolCandidateBuilder schoolCandidateBuilder = new SchoolCandidateBuilder();
        director.createSchoolCandidate(schoolCandidateBuilder);
        schoolCandidateBuilder.setSchoolName("School_Name");
        SchoolCandidate schoolCandidate = schoolCandidateBuilder.create();
        System.out.println(schoolCandidate.toString());

        //Building Election Candidate
        ElectionCandidateBuilder electionCandidateBuilder = new ElectionCandidateBuilder();
        director.createElectionCandidate(electionCandidateBuilder);
        electionCandidateBuilder.setElectionCampaignState("Assam");
        ElectionCandidate electionCandidate = electionCandidateBuilder.create();
        System.out.println(electionCandidate.toString());




    }
}
