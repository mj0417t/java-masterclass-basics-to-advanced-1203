public class SideItems {
    private String type;
    private double price;

    public SideItems(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public SideItems() {
        this.type = "fries";
    }

    public void makeSideItem(){
        System.out.println("Preparing "+type+"...\ndone!!! "+type+" added");
    }

    public double getPrice(){
        System.out.printf(type+  ": $");
        if(type.toLowerCase().equals("fries")){
            price=1.0;
        }else if(type.toLowerCase().equals("nuggets"))
            price=5.5;
        else if (type.toLowerCase().equals("wings"))
            price=15.0;
        System.out.println(price);
        return price;
    }

    public double getDeluxPrice() {
        return 15.0;
    }

    public void makeDeluxSideItem() {
        System.out.println("Adding Delux Side Items" +
                "Nuggets\n" +
                "Wings\n" +
                "Fries\n");
    }
}
