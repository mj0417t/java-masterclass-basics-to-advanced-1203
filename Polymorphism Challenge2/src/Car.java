public class Car {
    private String description;


    public Car(String description) {
        this.description = description;
    }

    protected void runEngine(){
        System.out.println("Car -> runEngine");
    };
    public void startEngine(){
        System.out.println("Car -> startEngine");
    };
    public void drive(){
        System.out.println("Car -> Driving type is "+ getClass().getSimpleName());
        runEngine();
    };

    public static Car getCar(String Engine, String description){
        return switch (Engine.toLowerCase().charAt(0)){
            case 'g' -> {
                System.out.println("Gas Powered Car Object invoked");
                yield new GasPoweredCar(description);
            }
            case 'e' -> {
                System.out.println("Electric Car Object invoked");
                yield new ElectricCar(description);
            }
            case 'h' ->{
                System.out.println("Hybrid Car Object invoked");
                yield new HybridCar(description);
            }
            default ->{
                System.out.println("Default");
                yield new Car(description);
            }
        };
    }
}
