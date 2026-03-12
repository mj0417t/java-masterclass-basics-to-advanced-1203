import java.util.ArrayList;

public class Hamburger {

    private String type;
    private ArrayList<String> toppings;
    private double price;

    private VegBurger vegBurger;
    private ChickenBurger chickBurger;
    private ShrimpBurger shrimpBurger;
    private PotatoBurger potatoBurger;
    private RegularBurger regBurger;

    private final double cheeseTopPrice =0.25;
    private final double pepperoniTopPrice=0.15;
    private final double onionTopPrice=0.10;
    private final double tomatoTopPrice=0.35;
    private final double doubleCheeseTopPrice=0.50;

    public Hamburger(String type, ArrayList<String> toppings) {
        this.type = type;
        if(toppings.size()>0)
            this.toppings = toppings;
    }

    public Hamburger(){
        type="regular";
        toppings=null;
    }

    public void makeBurgers(){
        switch (type.toLowerCase().charAt(0)){
            case 'v' ->{
                vegBurger = new VegBurger(toppings);
            }
            case 'c' -> {
                chickBurger = new ChickenBurger(toppings);
            }
            case 's' -> {
                shrimpBurger=new ShrimpBurger(toppings);
            }
            case 'p' -> {
                potatoBurger= new PotatoBurger(toppings);
            }
            default -> {
                regBurger = new RegularBurger();
            }

        }
    }

    public double getPrice(){
        System.out.printf(type+  " Burger: $");
        price = switch (type.toLowerCase().charAt(0)){
            case 'v' -> vegBurger.getPrice();
            case 'c' -> chickBurger.getPrice();
            case 's' -> shrimpBurger.getPrice();
            case 'p' -> potatoBurger.getPrice();
            default -> regBurger.getPrice();
        };
        if(toppings!=null && toppings.size()>0)
            getToppingPrice();
        System.out.println(price);
        return price;
    }

    private void getToppingPrice() {
        if(toppings.size()>0){
            for(String top: toppings){
                switch (top.toLowerCase().charAt(0)){
                    case 'c' -> price+=cheeseTopPrice;
                    case 'p' -> price+=pepperoniTopPrice;
                    case 'o' -> price+=onionTopPrice;
                    case 't' -> price+=tomatoTopPrice;
                    default -> price+=doubleCheeseTopPrice;
                }
            }
        }
    }

    public double getDeluxPrice() {
        return 100.0;
    }

    public void makeDeluxBurgers() {
        System.out.println("Adding:\n " +
                "Veg Burger\n" +
                "Cheese Burger\n" +
                "Shrimp Burger\n" +
                "Potato Burger\n");
    }
}
