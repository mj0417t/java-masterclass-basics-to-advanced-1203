import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Hamburger burger;
    static Drinks drinks;
    static SideItems sideItem;
    static ArrayList<String> toppings = new ArrayList<>();

    static double price=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Print any character to see menu or 'Q' to exit");
            String choice = sc.nextLine();

            if("Qq".contains(choice)){
                break;
            }

            String menu ="""
                    Select menu:
                    \tMeal Order - 
                    \t\ta. (1 regular burger + 1 small coke + fries)
                    \t\tb. (custom burger + Custom Drink + custom Side Item)
                    \tA Drink and A side item - 
                    \t\tc. drink
                    \t\td. Side item
                    \tBurgers - 
                    \t\te. Burger - (custom)
                    \tDelux Burger - 
                    \t\tf. Regular
                    \t\tg. Custom toppings
                    Enter your choice (a,b,c,d,e,f,g) or press 'Q' to quit;
                    """;
            System.out.println(menu);
            choice = sc.nextLine();
            if("Qq".contains(choice)){
                break;
            }
            switch (choice.toLowerCase().charAt(0)){
                case 'a' -> regularMealOrder();
                case 'b' -> customMealOrder(sc);
                case 'c' -> drinkOrder(sc);
                case 'd' -> sideItemOrder(sc);
                case 'e' -> customBurgerOrder(sc);
                case 'f' -> regularDeluxOrder();
                case 'g' -> customDeluxOrder(sc);
                default -> System.out.println("Wrong choice!!! select again. ");
            }

            price=0;
            if(toppings!=null)
                toppings.clear();

        }
    }

    private static void customDeluxOrder(Scanner sc) {
    }

    private static void regularDeluxOrder() {
        System.out.println("Regular Delux Order Recieved.");
        burger= new Hamburger();
        burger.makeDeluxBurgers();

        drinks = new Drinks();
        drinks.makeDeluxDrinks();

        sideItem = new SideItems();
        sideItem.makeDeluxSideItem();

        System.out.println("Order Completed:\n");
        price+=burger.getDeluxPrice();
        price+=drinks.getDeluxPrice();
        price +=sideItem.getDeluxPrice();
        System.out.println("Please pay $"+price);

    }

    private static void customBurgerOrder(Scanner sc) {
        System.out.println("Custom Burger Order Recieved:\n Enter type(Chicken Burger, Potato Burger, " +
                "Regular Burger, Shrimp Burger, Veg Burger)");
        String type = sc.nextLine();
        System.out.println("Select the toppings: a. Cheese, b. DoubleCheese, " +
                "c. onion, d. tomato e. chickBalls, f. exit if no toppings needed) ");
        while (true){
            String top = sc.nextLine();
            if(top.toLowerCase().equals("exit"))
                break;
            toppings.add(top);
        }

        burger= new Hamburger(type,toppings);
        burger.makeBurgers();


        System.out.println("Order Completed:\n" +
                "List of items are:");
        price+=burger.getPrice();
        System.out.println("Please pay $"+price);


    }

    private static void sideItemOrder(Scanner sc) {
        System.out.println("Custom Side Item order recieved\n" +
                "Enter SideItem type:(fries, nuggets, wings");
        String sideItemType=sc.nextLine();

        sideItem = new SideItems(sideItemType);
        sideItem.makeSideItem();

        System.out.println("Order Completed:\n" +
                "List of items are:");
        price +=sideItem.getPrice();
        System.out.println("Please pay $"+price);

    }

    private static void drinkOrder(Scanner sc) {
        System.out.println("Custom Drink order received");
        System.out.println("Enter Drink type:(coke, lemonade, soda");
        String drinkType=sc.nextLine();
        System.out.println("Enter Drink Size: large, medium, small");
        String drinkSize=sc.nextLine();
        drinks = new Drinks(drinkType,drinkSize);
        drinks.makeDrinks();

        System.out.println("Order Completed:\n" +
                "List of items are:");
        price+=drinks.getPrice();
        System.out.println("Please pay $"+price);

    }

    private static void customMealOrder(Scanner sc) {
        System.out.println("Custom Meal Order Recieved:\n Enter type(Chicken Burger, Potato Burger, " +
                "Regular Burger, Shrimp Burger, Veg Burger)");
        String type = sc.nextLine();
        System.out.println("Select the toppings: a. Cheese, b. DoubleCheese, " +
                "c. onion, d. tomato e. chickBalls, f. exit if no toppings needed) ");
        while (true){
            String top = sc.nextLine();
            if(top.toLowerCase().equals("exit"))
                break;
            toppings.add(top);

        }

        System.out.println("Enter Drink type:(coke, lemonade, soda");
        String drinkType=sc.nextLine();
        System.out.println("Enter Drink Size: large, medium, small");
        String drinkSize=sc.nextLine();

        System.out.println("Enter SideItem type:(fries, nuggets, wings");
        String sideItemType=sc.nextLine();

        burger= new Hamburger(type,toppings);
        burger.makeBurgers();

        drinks = new Drinks(drinkType,drinkSize);
        drinks.makeDrinks();

        sideItem = new SideItems(sideItemType);
        sideItem.makeSideItem();

        System.out.println("Order Completed:\n" +
                "List of items are:");
        price+=burger.getPrice();
        price+=drinks.getPrice();
        price +=sideItem.getPrice();
        System.out.println("Please pay $"+price);
    }

    private static void regularMealOrder() {
        System.out.println("Regular Meal Order Received:\n" +
                "Preparing the order!!!");
        burger= new Hamburger();
        burger.makeBurgers();

        drinks = new Drinks();
        drinks.makeDrinks();

        sideItem = new SideItems();
        sideItem.makeSideItem();

        System.out.println("Order Completed:\n" +
                "List of items are:");
        price+=burger.getPrice();
        price+=drinks.getPrice();
        price +=sideItem.getPrice();
        System.out.println("Please pay $"+price);

    }
}