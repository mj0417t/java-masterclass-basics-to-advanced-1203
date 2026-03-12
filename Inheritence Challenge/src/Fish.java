public class Fish extends Animal {
    private int fins;
    private int gills;

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }



    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    public void moveMuscles(){
        System.out.println("muscle moving");
    }

    public void moveBackFins(){
        System.out.println("backfins moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed=="fast")
            moveBackFins();
        System.out.println();
    }
}
