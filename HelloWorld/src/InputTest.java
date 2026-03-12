import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        int currentYear=2026;
        try{
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e){
                System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromScanner(int curYear){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi "+name+", thanks for taking the course");
        System.out.println("What year were you born? ");
        boolean validDOB=false;
        int age=0;
        do{
            System.out.println("Enter a year of birth >= "+(curYear-125)+ "and <="+curYear);
            try{
                age=checkData(curYear, scanner.nextLine());
            }catch (NumberFormatException badUserData){
                System.out.println("Characters are not allowed!!! Try again.");
            }

            validDOB=age<0?false:true;
        }while(!validDOB);

        return "So you are "+age+" year old.";
    }
    public static String getInputFromConsole(int curYear){
        String name = System.console().readLine("Hi What's your name? ");
        System.out.println("Hi "+name+", thanks for taking the course");
        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = curYear-Integer.parseInt(dateOfBirth);
        return "So you are "+age+" year old.";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob=Integer.parseInt(dateOfBirth);
        int minYear=currentYear-125;
        if(dob<minYear||dob>currentYear) return -1;
        else return currentYear-dob;
    }
}
