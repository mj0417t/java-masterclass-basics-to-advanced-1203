import java.util.ArrayList;
import java.util.List;

record Affiliation(String  name, String type, String countryCode){
    @Override
    public String toString() {
        return name+ " (" +type +" in "+countryCode +")";
    }
}
public class Team<T extends Player, S> {
    private String teamName;
    private List<T> teamMembers = new ArrayList<>();

    private int totalWins=0;
    private int totalLoses=0;
    private int totalTies=0;
    private S affiliation;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, S affiliation) {
        this.teamName = teamName;
        this.affiliation = affiliation;
    }

    public void addTeamMemeber(T t){
        if(!teamMembers.contains(t))
            teamMembers.add(t);
    }

    public void listTeamMembers(){
        System.out.println(teamName + "Roaster: ");
        System.out.println(affiliation==null?"":"Affiliation: "+affiliation);
        for(T t:teamMembers){
            System.out.println(t.name());
        }
//        System.out.println(teamMembers);
    }

    public int ranking(){
        return (totalLoses*2)+totalTies+1;
    }

    public String setScore(int ourScore, int theirScore){
        String msg="lost to ";
        if(ourScore>theirScore){
            totalWins++;
            msg="beat";
        } else if (ourScore==theirScore) {
            totalTies++;
            msg="tied";
        }else
            totalLoses++;

        return msg;
    }

    @Override
    public String toString() {
        return teamName+ " (Ranked "+ranking()+")";
    }
}
