//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

interface Player{
    String name();
}
record BaseballPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}
record VolleyballPlayer(String name, String position) implements Player{}
public class Main {
    public static void main(String[] args) {
//        BaseballTeam phillies1= new BaseballTeam("Philadelphia Phillies");
//        BaseballTeam astros1= new BaseballTeam("Houston Astros");
////        scoreResult(phillies1,3,astros1,5);
//
//        SportsTeam phillies2= new SportsTeam("Philadelphia Phillies");
//        SportsTeam astros2= new SportsTeam("Houston Astros");
//        scoreResult(phillies2,3,astros2,5);

        var philly = new Affiliation("City","Philadephia, PA", "US");

        Team<BaseballPlayer,Affiliation> phillies= new Team<>("Philadelphia Phillies",philly);
        Team<BaseballPlayer,Affiliation> astros= new Team<>("Houston Astros");
        scoreResult(phillies,3,astros,5);

        var harper= new BaseballPlayer("B Harper","Right Fielder");
        var marsh= new BaseballPlayer("B Marsh","Right Fielder");
        var futhrie = new BaseballPlayer("D Guthrie","Center Fielder");
        phillies.addTeamMemeber(futhrie);
        phillies.addTeamMemeber(harper);
        phillies.addTeamMemeber(marsh);
        phillies.listTeamMembers();

//        SportsTeam afc=new SportsTeam("Adelaide crows");
        Team<FootballPlayer,String> afc=new Team<>("Adelaide crows","City of Adelaide, South Australia,AU");
        var tex = new FootballPlayer("Tex Walker","Centre Half forward");
        afc.addTeamMemeber(tex);
        var rory = new FootballPlayer("Rory Laird", "MidField");
        afc.addTeamMemeber(rory);
        afc.listTeamMembers();


        Team<VolleyballPlayer,Affiliation> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMemeber(new VolleyballPlayer("Roberrt Williams","Net Position"));
        adelaide.listTeamMembers();

        var canberra = new Team<VolleyballPlayer,Affiliation>("Canberra Heat");
        canberra.addTeamMemeber(new VolleyballPlayer("Roman Shae","Setter"));
        canberra.listTeamMembers();
        scoreResult(canberra,0,adelaide,1);
    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score){
        String msg=team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1, msg, team2);
    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score){
        String msg=team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1, msg, team2);
    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score){
        String msg=team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score,t1_score);
        System.out.printf("%s %s %s %n",team1, msg, team2);
    }
}