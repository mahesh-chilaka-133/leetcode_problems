package arrays;
public class FrequencySortedArray {

    public static void printFrequencies(int[] arr) {

        int n = arr.length;
        int count = 1;  

        for(int i = 1; i < n; i++) {

            if(arr[i] == arr[i - 1]) {
                count++;
            } 
            else {
                System.out.println(arr[i - 1] + " -> " + count);
                count = 1;
            }
        }

        System.out.println(arr[n - 1] + " -> " + count);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,4};
        printFrequencies(arr);
    }
}