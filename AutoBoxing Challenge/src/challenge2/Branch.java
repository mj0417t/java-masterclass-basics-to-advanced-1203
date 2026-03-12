package challenge2;

import java.util.ArrayList;
public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name=name;
        customers = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialDeposit){
        if(findCustomer(customerName)==null){
            Customer customer= new Customer(customerName,initialDeposit);
            customers.add(customer);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double x){
        Customer customer=findCustomer(name);
        if(customer!=null){
            customer.addTransaction(x);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name){
        for(Customer customer:customers){
            if(customer.getName().equalsIgnoreCase(name))
                return customer;
        }
        return null;
    }


}
