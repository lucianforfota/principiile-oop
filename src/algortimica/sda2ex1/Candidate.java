package algortimica.sda2ex1;

public class Candidate {

    private String name;
    private int numberOfVotes;


    public Candidate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(int numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

    public void vote (){
        this.numberOfVotes++;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", numberOfVotes=" + numberOfVotes +
                '}';
    }
}
