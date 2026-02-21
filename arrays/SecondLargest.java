package arrays;

public class SecondLargest {

    public static int secondLargest(int arr[]){
        int secondLargest = -1;
        int largest = 0;
        for(int i = 0; i < arr.length;i++){
            if (arr[i] >largest){
                secondLargest = largest;
                largest = arr[i];

            }else if (arr[i] != largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};   
        System.out.println("Test 1 Result: " + secondLargest(arr)); 
    }
    
}
