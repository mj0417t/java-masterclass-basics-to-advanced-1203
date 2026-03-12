public class Customer {
    private String name;
    private int credit_limit;
    private String email;

    public int getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Customer(String name, String email, int credit_limit){
        this.name=name;
        this.email=email;
        this.credit_limit=credit_limit;
        System.out.println("Customer created:\nName: "+name
        +"\nEmail address: "+email
        +"\nCredit Limit: "+credit_limit
        );
    }
    public Customer(){
        this("musarrat","mj.0417@gmail.com",25000);
        System.out.println("Default Empty Constructor called");
    }
    public Customer(String name, String email){
        this(name, email, 0);
        System.out.println("New Customer created!!!");
    }


}
