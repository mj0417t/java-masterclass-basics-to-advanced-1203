public class MealOrder {
    private Item side;
    private Item drink;
    private Burger burger;


    public MealOrder(){
        this("regular","coke","fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType){
        if(burgerType.equalsIgnoreCase("deluxe"))
            this.burger=new DeluxBurger(burgerType,8.5);
        else
            this.burger = new Burger(burgerType,4.0);

        this.drink = new Item(drinkType,"drink",1.00);
        this.side= new Item(sideType,"SIDE",1.50);
    }

    public double getTotalPrice(){
        if(burger instanceof DeluxBurger)
            return burger.getAdjustedPrice();
        return side.getAdjustedPrice()+drink.getAdjustedPrice()+burger.getAdjustedPrice();
    }

    public void printItemisedList(){
        burger.printItem();
        if(burger instanceof DeluxBurger){
            Item.printItem(drink.getName(),0);
            Item.printItem(side.getName(),0);
        }else{
            side.printItem();
            drink.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addToppings(String extra1, String extra2, String extra3 ){
        burger.addToppings(extra1,extra2,extra3);
    }
    public void setDrinkSize(String size){
        drink.setSize(size);
    }
    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5 ){
        if(burger instanceof DeluxBurger db)
            db.addToppings(extra1,extra2,extra3,extra4,extra5);
        else
            burger.addToppings(extra1,extra2,extra3);
    }

}
