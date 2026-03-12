import java.util.Scanner;

public class ReadInteger {
    public int[] readInteger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to sort separated by a comma");
        String input = sc.nextLine();
        String[] nums = input.split(",");
        int[] numbers = new int[nums.length];
        for(int i=0;i<numbers.length;i++)
            numbers[i]=Integer.parseInt(nums[i].trim());
        return numbers;

    }
}
