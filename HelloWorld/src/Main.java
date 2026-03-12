public class Main {
    public static void main(String[] args) {

        BankAccount b= new BankAccount();
        BankAccount c= new BankAccount(112,1,"abc","abc@gmail.com",2434234233l);

        b.setAccountNumber(123);
        b.setAccountBalance(00);
        b.setCustomerName("Raju");
        b.setEmail("raju@gmail.com");
        b.setPhoneNumber(9904321344l);
        System.out.println("Account Details:\n "
                +"Customer Name:"+b.getCustomerName()
                +"\n Account Number: "+b.getAccountNumber()
                +"\n Account Balance: "+b.getAccountBalance()
                +"\n Phone Number: "+b.getPhoneNumber()
                +"\n Email: "+b.getEmail());

        if(b.withdrawFund(23400)){
            System.out.println("Money withdrawn successfully\n Remaining balance:"+b.getAccountBalance());
        }else{
            System.out.println("Money couldn't be withdrawn due to insufficient balance:");
        }
        b.depositFund(100000);
        System.out.println("Money deposited. Current account balance: "+b.getAccountBalance());
    }
}
