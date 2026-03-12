public class Furniture extends ProductForSale{
    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This "+type+ " was manufactured in Carolina");
        System.out.printf("The price of this tv is $%6.2f %n",price);
        System.out.println(description);
    }
}
