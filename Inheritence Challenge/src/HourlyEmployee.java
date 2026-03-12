public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate=hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }

    @Override
    public double collectPay(){
        return 5*20*hourlyPayRate;
    }

    public HourlyEmployee(){
        this("Default Hourly Employee","18/07/1993","11/07/2026",40.0);

    }

    public double getDoublePay(){
        return 2*collectPay();
    }
}
