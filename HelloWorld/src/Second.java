public class Second {
    public void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName+ " managed to get into position "+position+" on the high score list. ");
    }

    public int calculateHighScorePosition(int score){
        if(score>=1000)
            return 1;
        else if(score>=500 && score<1000)
            return 2;
        else if(score>=100 && score<500)
            return 3;
        else
            return 4;
    }
    public static void main(String[] args){
        Second sc = new Second();
        sc.displayHighScorePosition("Tim", sc.calculateHighScorePosition(1500));
        sc.displayHighScorePosition("Tim", sc.calculateHighScorePosition(1000));
        sc.displayHighScorePosition("Tim", sc.calculateHighScorePosition(500));
        sc.displayHighScorePosition("Tim", sc.calculateHighScorePosition(100));
        sc.displayHighScorePosition("Tim", sc.calculateHighScorePosition(25));
    }
}
