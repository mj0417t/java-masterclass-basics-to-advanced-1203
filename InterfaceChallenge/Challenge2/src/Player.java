import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    // write code here
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public Player(String name, int hitPoints, int strength){
        this.name=name;
        this.hitPoints=hitPoints;
        this.strength=strength;
        weapon="Sword";
    }

    @Override
    public List<String> write() {
        List<String> playerDetails =new ArrayList<>();
        playerDetails.add(name);
        playerDetails.add(String.valueOf(hitPoints));
        playerDetails.add(String.valueOf(strength));
        playerDetails.add(weapon);
        return playerDetails;
    }

    @Override
    public void read(List<String> list) {
        if(list!=null && list.size()>0){
            this.name=list.get(0);
            this.hitPoints=Integer.parseInt(list.get(1));
            this.strength=Integer.parseInt(list.get(2));
            this.weapon=list.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}