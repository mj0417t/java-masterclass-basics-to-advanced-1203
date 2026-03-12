public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public int getAge(){
        int curr_year=2025;
        return curr_year-Integer.parseInt(birthDate.substring(6));
    }

    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate){
        this.endDate=endDate;
    }


    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker(){
        this("Default user", "24/01/1997");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
