//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("coke", "drink",1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Avocado", "topping", 1.50);
//        avocado.printItem();
//        Burger burger = new Burger("regular",4.0);
//        burger.addToppings("Cheese","Bacon","Mayo");
//        burger.printItem();

//        MealOrder regularMeal =new MealOrder();
//        regularMeal.addToppings("Cheese","Bacon","Mayo");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemisedList();

//        MealOrder secMeal = new MealOrder("Turkey", "7-up","chilli");
//        secMeal.addToppings("Cheese","Lettuce","Mayo");
//        secMeal.setDrinkSize("SMALL");
//        secMeal.printItemisedList();

        MealOrder deluxeMeal = new MealOrder("deluxe","7-up","chilli");
        deluxeMeal.addToppings("Avocado","Mayo","cheese","onion","lettuce");
        deluxeMeal.setDrinkSize("LARGE");
        deluxeMeal.printItemisedList();

    }
}