import java.util.ArrayList;

public class ShrimpBurger extends Hamburger {

    private double price =22.5; //default potato burger price

    public ShrimpBurger(ArrayList<String> toppings) {
        makeShrimpBurger(toppings);
    }

    private void makeShrimpBurger(ArrayList<String> toppings) {
        System.out.println("Making Shrimp burger...");
        addToppings(toppings);
        System.out.println("shrimp burger is ready");
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
