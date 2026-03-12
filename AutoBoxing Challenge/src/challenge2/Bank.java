package challenge2;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name=name;
        branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName)==null){
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for(Branch branch:branches){
            if(branch.getName().equalsIgnoreCase(branchName))
                return branch;
        }
        return null;
    }

    public boolean addCustomer(String branch, String customerName, double initialDeposit){
        Branch bran= findBranch(branch);
        if(bran!=null){
            return bran.newCustomer(customerName,initialDeposit);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branch, String customerName, double transaction){
        Branch bran= findBranch(branch);
        if(bran!=null){
            return bran.addCustomerTransaction(customerName,transaction);
        }
        return false;

    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch=findBranch(branchName);
        if(branch!=null){
            System.out.println("Customer details for branch "+branch.getName());
            // branch.printTransaction();

            int i=1;
            for(Customer customer:branch.getCustomers()){
                System.out.println("Customer: "+customer.getName()+"["+i+"]");
                i++;
                int j=1;
                if(printTransactions){
                    System.out.println("Transactions");
                    for (double d: customer.getTransactions())
                        System.out.printf("[%d] Amount %.2f\n",j,d);
                    j++;
                }
            }

            return true;
        }
        return false;
    }
}
