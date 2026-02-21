package arrays;
import java.util.*;

public class LeadersInArray {

    public static void printLeaders(int[] arr) {
        int n = arr.length;

        int maxRight = Integer.MIN_VALUE;   
        List<Integer> leaders = new ArrayList<>();

        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] > maxRight) {
                leaders.add(arr[i]);
                maxRight = arr[i];
            }
        }

        Collections.reverse(leaders);
        System.out.println(leaders);
    }

    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        printLeaders(arr);
    }
}