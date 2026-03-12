import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int length=5;
//        int[] arr=new int[length];
//        arr=createRandomArray(arr,length);
//        System.out.println(Arrays.toString(arr));
        //Arrays.sort(arr);
        //sortDescOrder(arr);
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(sortIntegers(arr)));

        ReadInteger rdi = new ReadInteger();
        int[] arr = rdi.readInteger();
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum value in the arr: "+findMin(arr));


    }

    private static int findMin(int[] arr) {
        int min =arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }

    private static void sortDescOrder(int[] arr) {
        mergeSort(arr,0,arr.length-1);
    }

    private static void mergeSort(int[] arr, int low, int high) {
        int mid=(low+high)/2;
        if(low>=high) return;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i=low,j=mid+1;
        while(i<=mid && j<=high){
            if(arr[i]<arr[j])
                temp.add(arr[j++]);
            else
                temp.add(arr[i++]);
        }

        while (i<=mid){
            temp.add(arr[i++]);
        }

        while (j<=high){
            temp.add(arr[j++]);
        }

        for(int k=low;k<=high;k++)
            arr[k]=temp.get(k-low);
    }

    private static int[] createRandomArray(int[] arr, int length) {
        Random random = new Random();
        for(int i=0;i<length;i++){
            arr[i]= random.nextInt(100);
        }
        return arr;
    }

    public static int[] sortIntegers(int[] arr){

        int[] new_arr = Arrays.copyOf(arr, arr.length);
        //select min & swap
        int len= new_arr.length;
        boolean isSwapReq = false;
        for(int i=0;i<len-1;i++){
            int max=i;
            //selecting min
            for(int j=i+1;j<len;j++){
                if(new_arr[j]>new_arr[max]){
                    max=j;
                    isSwapReq=true;
                }
            }
            //swap a[i] & a[min]
            if(isSwapReq){
                int temp=new_arr[i];
                new_arr[i]=new_arr[max];
                new_arr[max]=temp;
            }
        }
        System.out.println("After Sorting --->"+Arrays.toString(new_arr));
        return new_arr;
    }
}