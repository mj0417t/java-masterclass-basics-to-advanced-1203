public class Animal {
    protected String type;
    private String size;
    private double weight;

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
public Animal(){

}
    public Animal(String type, String size, double weight) {
        this.weight = weight;
        this.size = size;
        this.type = type;
    }

    public void move(String speed){
        System.out.println(type+" moves "+speed);
    }
    public void makeNoise(){
        System.out.println(type+ " makes some kind of noise");
    }
}
