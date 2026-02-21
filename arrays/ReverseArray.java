package arrays;
import java.util.Arrays;
public class ReverseArray {
    public static void reverse(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};   
        reverse(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
    
}
