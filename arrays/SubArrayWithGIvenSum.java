package arrays;

public class SubArrayWithGIvenSum {
    
    public static boolean subarrayWithGivenSum(int [] arr,int sum){
        int i = 0;
        int curSum = 0;

        for (int j = 0; j < arr.length;j++){
            curSum += arr[j];
            while (curSum > sum){
                curSum -= arr[i];
                i++;
            }
            if (curSum == sum){
            return true;
        }
        
        }
        return false;
    }
    public static void main(String[] args) {
         int[] arr = {12, 35, 1, 10, 34, 1}; 
         int sum = 46; 
         System.out.println("Result is : "+ subarrayWithGivenSum(arr,sum));

    }
    
}
