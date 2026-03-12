public class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
        avgKmPerCharge=24;
        batterySize=7;
    }


    public ElectricCar(String description, double avgKmPerCharge, int batterySize){
        super(description);
        this.avgKmPerCharge=avgKmPerCharge;
        this.batterySize=batterySize;

    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> Switch %d kwh battery on,  Ready: %n",batterySize);
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> usage exceeds the aveg: %.2f %n", avgKmPerCharge);
    }
}
