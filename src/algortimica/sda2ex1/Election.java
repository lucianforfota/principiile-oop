package algortimica.sda2ex1;

import java.util.ArrayList;

public class Election {


    ArrayList<Candidate> candidates;


    public Election(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
    }


    public void vote (String candidateName) throws  Exception{
        //cautam candidatul cu numele candidateName
        //la acel candidata adaugam un vot
        for (Candidate candidate: candidates) {
            if(candidateName.equals(candidate.getName())){
                candidate.vote();
                return;
            }
        }
        //System.out.println("candidatul nu exista");

        throw new Exception("candidatul nu exista");
    }

    public Candidate declareWinner(){
        int maxVotes = 0;
        Candidate winner = null;
        for (Candidate candidate : candidates){
            if (candidate.getNumberOfVotes() > maxVotes){
                maxVotes = candidate.getNumberOfVotes();
                winner = candidate;
            }
        }
        return winner;
    }
}
