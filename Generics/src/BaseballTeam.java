import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {
    private String teamName;
    private List<BaseballPlayer> teamMembers = new ArrayList<>();

    private int totalWins=0;
    private int totalLoses=0;
    private int totalTies=0;

    public BaseballTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMemeber(BaseballPlayer player){
        if(!teamMembers.contains(player))
            teamMembers.add(player);
    }

    public void listTeamMembers(){
        System.out.println(teamName + "Roaster: ");
        System.out.println(teamMembers);
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
