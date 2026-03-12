public class DeluxBurger extends Burger{
    Item delux1;
    Item delux2;


    public DeluxBurger(String name, double price) {
        super(name, price);
    }


    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        delux1=new Item(extra4,"TOPPING", 0);
        delux2=new Item(extra5,"TOPPING", 0);;
    }

    @Override
    public void printItemisedList() {
        super.printItemisedList();
        if (delux1!=null)
            delux1.printItem();
        if (delux2!=null)
            delux2.printItem();
    }

    @Override
    public double getExtraPrice(String topName) {
        return 0;
    }
}
