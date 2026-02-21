package arrays;

public class ArrayIsSorted {

    public static boolean isSorted(int [] arr){
        for ( int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};   
        System.out.println("sorted: " + isSorted(arr)); 
    }
    
}
