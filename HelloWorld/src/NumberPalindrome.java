public class NumberPalindrome {
    // write code here
    public static boolean isPalindrome(int num){
        int reverse=0;
        int temp = num;
        while(temp!=0){
            int rem=temp%10;
            reverse=reverse*10 + rem;
            temp/=10;
        }
        if(num==reverse) return true;
        return false;
    }

    public static void main(String[] args) {
        int num=-1222221;
        if(isPalindrome(num)) System.out.println(num+" is palindrome");
        else System.out.println(num +" is not a palindrome");

    }
}