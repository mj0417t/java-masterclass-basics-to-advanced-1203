import java.util.ArrayList;

public class VegBurger extends Hamburger {

    private double price =3.0; //default potato burger price

    public VegBurger(ArrayList<String> toppings) {
        makeVegBurger(toppings);
    }

    private void makeVegBurger(ArrayList<String> toppings) {
        System.out.println("Making Veg burger...");
        addToppings(toppings);
        System.out.println("Veg burger is ready");
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
