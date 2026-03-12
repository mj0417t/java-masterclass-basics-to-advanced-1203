public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }
    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }


    public void addWater(){
        System.out.println("Adding water to coffee maker");
        brewMaster.setHasWorkToDo(true);
    }
    public void pourMilk(){
        System.out.println("Puring milk from Refrigerator");
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher(){
        System.out.println("Loading dishwasher");
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffeeMachine,boolean refrigerator, boolean dishWash){
        System.out.println("Setting the kitchen appliances");
        brewMaster.setHasWorkToDo(coffeeMachine);
        iceBox.setHasWorkToDo(refrigerator);
        dishWasher.setHasWorkToDo(dishWash);
    }

    public  void  doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
