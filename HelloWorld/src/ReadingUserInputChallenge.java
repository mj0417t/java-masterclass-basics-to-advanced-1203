import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum=0;
        int counter=1;
        do{
            System.out.println("Enter number #"+counter+":");
                String nextNumber=scanner.nextLine();
                try{
                    //int num = Integer.parseInt(nextNumber);
                    double num = Double.parseDouble(nextNumber);
                    sum+=num;
                    counter++;
                }catch (NumberFormatException nfe){
                    System.out.println("Invalid Number");
                }
        }while(counter<=5);

        System.out.println("The sum is "+sum);
    }
}
