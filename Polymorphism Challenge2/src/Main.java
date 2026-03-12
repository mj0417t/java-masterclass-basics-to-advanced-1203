//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = Car.getCar(" ","2022 Blue Ferrari 296 GTS");
        runCar(car);
        System.out.println();
        Car ferari = Car.getCar("GasPowered","2022 Blue Ferrari 296 GTS");
        runCar(ferari);
        System.out.println();
        Car tesla = Car.getCar("Electric Car","2022 Blue Ferrari 296 GTS");
        runCar(tesla);
        System.out.println();
        Car feraH = Car.getCar("Hybrid","2022 Blue Ferrari 296 GTS");
        runCar(feraH);
        System.out.println();

        Car fer = new GasPoweredCar("2022 Blue Ferrari 296 GTS",15.4,6);
        runCar(ferari);
        System.out.println();
        System.out.println();
        System.out.println();
        Car teslaH = new ElectricCar("2022 Red Tesla Modedl 3", 568,75);
        runCar(tesla);
        System.out.println();
        System.out.println();
        System.out.println();

        Car ferariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale", 16,8,8);
        runCar(ferariHybrid);
    }
    public static void runCar(Car car){
        car.startEngine();;
        car.drive();
    }
}