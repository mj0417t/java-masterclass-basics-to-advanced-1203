import java.util.ArrayList;

public class PotatoBurger extends Hamburger {

    private double price =4.0; //default potato burger price

    public PotatoBurger(ArrayList<String> toppings) {
        makePotBurger(toppings);
    }

    private void makePotBurger(ArrayList<String> toppings) {
        System.out.println("Making potato burger...");
        addToppings(toppings);
        System.out.println("Potato burger is ready");
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
