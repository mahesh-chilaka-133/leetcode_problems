package arrays;

public class LargestNumber {

    public static int largest(int arr[]){
      
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            if (arr[i] >largest){
                largest = arr[i];

            }
    }
     return largest;
}
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};   
        System.out.println(" largest number: " + largest(arr)); 
    }
    
 
}