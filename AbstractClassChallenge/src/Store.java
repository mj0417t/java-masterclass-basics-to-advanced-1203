import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    static void main(String[] args) {
        storeProducts.add((new TV("Android", 4500,"93 inch Sony 2025x")));
        storeProducts.add((new TV("IOS", 10000,"93 inch Apple 3d advanced 2030")));
        storeProducts.add((new Furniture("Desk", 10000,"Mahogany Desk")));
        storeProducts.add((new Furniture("Lamp", 10000,"Tipphany lamp")));
        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1,1,2);
        addItemToOrder(order1,0,1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2,3,5);
        addItemToOrder(order2,0,1);
        addItemToOrder(order1,2,1);
        printOrder(order2);
    }

    public static void listProducts() {
        for(var item: storeProducts){
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem>order){
        double salesTotal=0;
        for (var item: order){
            item.product().printPricedItem(item.quantity());
            salesTotal+=item.product().getSalesPrice(item.quantity());
        }

        System.out.printf("Sales Total = $%6.2f %n", salesTotal);

    }
}
