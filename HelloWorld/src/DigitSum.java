public class DigitSum {
    public static void main(String[] args) {
        int number=1004;
        if(sumDigits(number)==-1)
            System.out.println("Invalid Number");
        else
            System.out.println("Sum of the digits: "+sumDigits(number));
    }

    private static int  sumDigits(int number) {
        if(number<0) return -1;
        int sum=0;
        while(number!=0){
            sum+=number%10;
            number/=10;
        }
        return sum;
    }
}
