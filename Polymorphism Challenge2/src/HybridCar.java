public class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
        avgKmPerLitre=99;
        batterySize=400;
        cylinders=8;
    }


    public HybridCar(String description, double avgKmPerLitre, int cylinders,
                     int batterySize){
        super(description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.cylinders=cylinders;
        this.batterySize=batterySize;

    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> All %d cylinders are fired up, Ready: %n",cylinders);
        System.out.printf("Hybrid -> Switch %d kwh battery on,  Ready: %n",batterySize);
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> usage exceeds the aveg: %.2f %n", avgKmPerLitre);
    }
}
