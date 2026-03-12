import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        int loopCount=0;
        while(true){
            System.out.println("Enter a number or any character to quit");
            String data = scanner.nextLine();
            try{
                int num=Integer.parseInt(data);
                if(num>max) max=num;
                if (num<min) min=num;
                loopCount++;
            }catch (NumberFormatException nfe){
                System.out.println("User entered a character");
                break;
            }

        }
        if(loopCount>0){
            System.out.println("The maximum number entered by user is "+max);
            System.out.println("The minimum number entered by user is "+min);
        }else{
            System.out.println("No valid data entered");
        }

    }
}
