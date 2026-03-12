import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();

        while(true){
            printAction();
            int choice=Integer.parseInt(sc.nextLine());
            if(choice==0)
                break;
            else if(choice==1)
                addItems(groceryList);
            else if(choice==2)
                removeItems(groceryList);
            else
                System.out.println("Invalid choice!!! Select again.");
        }

        groceryList.sort(Comparator.naturalOrder());
        System.out.println("Items added successfully\n"+groceryList);

    }

    private static void printAction() {
        String textBlock= """
            Available actions:
            0 - to shutdown
            1 - to add item(s) to list (comma delimited list)
            2 - to remove any item(s) (comma delimited list)
            Enter a number for which  action you want to do:
            """;
        System.out.println(textBlock+" ");
    }

    private static void removeItems(ArrayList<String> groceryList) {
        System.out.println("Enter items you want to remove to the list (comma separated:)");
        String itemsToAdd= sc.nextLine();
        String[] itemsArr=itemsToAdd.split(",");
        for(String item: itemsArr){
            item=item.trim().toUpperCase();
            if(groceryList.contains(item))
                groceryList.remove(item);
        }

    }

    private static void addItems(ArrayList<String> groceryList) {
        System.out.println("Enter items you want to add to the list (comma separated:)");
        String[] itemsArr= sc.nextLine().split(",");
        for(String item: itemsArr){
            item=item.trim().toUpperCase();
            if(!groceryList.contains(item))
                groceryList.add(item);
        }
    }

}