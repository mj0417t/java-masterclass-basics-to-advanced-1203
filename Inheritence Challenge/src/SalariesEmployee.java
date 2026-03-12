public class SalariesEmployee  extends Employee{
    private double annualSalary;
    private boolean isRetired;
    public SalariesEmployee(){
        this("Default Salaried Employee","17/04/1998","23/04/2002",0.0);
    }

    public SalariesEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary=annualSalary;
    }

    @Override
    public double collectPay(){
        double payCheck =annualSalary/26;
        double adjustedPay = (isRetired)? 0.9*payCheck : payCheck;
        return (int) adjustedPay;
    }

    public void retire(){
        terminate("05/02/2026");
        isRetired=true;
    }

    @Override
    public String toString() {
        return "SalariesEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}


