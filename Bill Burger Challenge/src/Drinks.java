public class Drinks {

    private String type;
    private String size;
    private double price;
    private Coke coke;
    private Soda soda;
    private Lemonade lemonade;

    public Drinks(String type, String size) {
        this.type = type;
        this.size = size;
    }
    public Drinks() {
        this.type = "regular";
        this.size = "small";
    }

    public void makeDrinks(){
        switch (type.toLowerCase().charAt(0)){
            case 'c' ->{
                coke = new Coke(size);
            }
            case 's' -> {
                soda = new Soda(size);
            }
            case 'l' -> {
                lemonade=new Lemonade(size);
            }
            case 'r' -> {
                coke = new Coke();
            }
            default -> {
                System.out.println("Drink not available");
            }

        }
    }

    public double getPrice(){
        System.out.printf((type=="regular"?"coke":type)+  ": $");
        price = switch (type.toLowerCase().charAt(0)){
            case 's' -> soda.getPrice();
            case 'l' -> lemonade.getPrice();
            case 'c','r' -> coke.getPrice();
            default -> 0;
        };
        System.out.println(price);
        return price;
    }

    public double getDeluxPrice() {
        return 20.0;
    }

    public void makeDeluxDrinks() {
        System.out.println("Adding Delux Drinks" +
                "Soda\n" +
                "Lemonade\n" +
                "Coke\n");
    }
}
