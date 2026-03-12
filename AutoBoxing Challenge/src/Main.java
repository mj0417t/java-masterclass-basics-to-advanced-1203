//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer bob= new Customer("Somna",23123);
        System.out.println(bob);
        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Rosalie",500);
        System.out.println(bank);
        bank.addTransaction("Rosalie",-10.24);
        bank.addTransaction("Rosalie",-75.01000);
        bank.printStatement("Rosalie");

        bank.addTransaction("Somna", -23);
        bank.printStatement("Somna");
    }
}