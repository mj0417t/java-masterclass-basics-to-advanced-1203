public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    private void bark(){
        System.out.println("woof!");
    }
    public void run(){
        System.out.println("Dog running");
    }
    public void walk(){
        System.out.println("Dog walking");
    }
    public void wagTail(){
        System.out.println("Dog wailing its tail");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight<15 ? "small":(weight<35 ? "medium": "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }


    public Dog(){
        super("Mutt","Big", 50.0);
    }



    public Dog(String type, double weight){
        this(type,weight, "Perky", "Curled");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tail.");
        if(speed=="slow"){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        System.out.println();

    }
    @Override
    public void makeNoise(){
        if(type=="Wolf")
            System.out.println("Ow woooooo!");
        bark();
        System.out.println();

    }
}
