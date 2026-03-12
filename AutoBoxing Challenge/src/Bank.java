import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    public Bank(String name){
        this.name=name;
        customers = new ArrayList<>();
    }

    private Customer getCustomer(String customerName){
        for(Customer customer:customers){
            if(customer.getName().equalsIgnoreCase(customerName))
                return customer;
        }
        System.out.printf("Customer %s was not found\n",customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit){
        if(getCustomer(customerName)==null){
            Customer customer= new Customer(customerName,initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: "+customer);
        }

    }

    public void addTransaction(String name, double x){
        Customer customer=getCustomer(name);
        if(customer!=null)
            customer.addTransaction(x);

    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void printStatement(String customerName){
        Customer customer=getCustomer(customerName);
        if(customer==null)
            return;
        else{
            System.out.println("-".repeat(30));
            System.out.println("Customer Name: "+customer.getName());
            System.out.println("Transactions:");
            for (double d: customer.getTransactions())
                System.out.printf("$%10.2f (%s)%n",d,d<0?"debit":"credit");
        }

    }
    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
