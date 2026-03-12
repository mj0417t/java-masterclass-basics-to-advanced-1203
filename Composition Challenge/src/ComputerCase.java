public class ComputerCase extends Monitor{
    private  String powerSupply;

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }
    public void pressPowerButton(){
        System.out.println("Power Button pressed...");
    }
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }
}
