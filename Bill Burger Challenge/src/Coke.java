public class Coke {
    private double price=1.5;
    private String size;

    public Coke(String size) {
        System.out.println("Filling Coke of "+size+" size.");
        this.size=size;
    }
    public Coke() {
        System.out.println("Filling Coke");
    }

    public double getPrice() {
        if(size!=null){
            if(size.toLowerCase().equals("large"))
                price = 3.0;
            else if(size.toLowerCase().equals("medium"))
                price =2.45;
        }

        return price;
    }
}
