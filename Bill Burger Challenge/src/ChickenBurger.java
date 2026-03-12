import java.util.ArrayList;

public class ChickenBurger extends Hamburger {

    private double price =10.0; //default potato burger price

    public ChickenBurger(ArrayList<String> toppings) {
        makechickBurger(toppings);
    }

    private void makechickBurger(ArrayList<String> toppings) {
        System.out.println("Making chicken burger...");
        addToppings(toppings);
        System.out.println("chicken burger is ready");
    }

    private void addToppings(ArrayList<String> toppings) {
        if (toppings.size()>0){
            System.out.println("Adding toppings!!!");
            for(String topping:toppings){
                System.out.println("Topping: "+topping+" added...");
            }
        }else
            System.out.println("No topping selected");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
