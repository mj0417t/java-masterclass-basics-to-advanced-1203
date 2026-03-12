public class TV extends ProductForSale{
    public TV(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This "+type+ " is an advanced technology");
        System.out.printf("The price of this tv is $%6.2f %n",price);
        System.out.println(description);
    }
}
