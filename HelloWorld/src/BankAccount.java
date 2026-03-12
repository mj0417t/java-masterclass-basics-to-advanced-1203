public class BankAccount {
    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount() {
        this(112,11,"dsfsdf","sdsdfs",12341342l);
        System.out.println("Empty Constructor is called");
    }
    public BankAccount(int accountBalance,int accountNumber, String customerName, String email, long phoneNumber) {
        this.accountBalance=accountBalance;
        this.accountNumber=accountNumber;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.customerName=customerName;
        System.out.println("Parameterized  Constructor is called");
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void  depositFund(int x){
        this.accountBalance+=x;
    }

    public boolean withdrawFund(int x){
        if(x>this.accountBalance) return false;
        else{
            this.accountBalance-=x;
            return true;
        }
    }
}
