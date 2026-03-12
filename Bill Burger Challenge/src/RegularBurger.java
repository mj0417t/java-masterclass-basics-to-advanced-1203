public class RegularBurger extends Hamburger {
    private double price = 2.5;
    public RegularBurger() {
        makeRegBurgers();
    }

    private void makeRegBurgers() {
        System.out.println("Making Regular Burger");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
