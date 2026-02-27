package arrays;

public class LongestEvenOddSubArray {

    public static int longestEvenOddSubArray(int[] nums){

        int res = 1;
        int cur = 1;

        for(int i = 1; i < nums.length; i++){


            if(nums[i] % 2 != nums[i-1] % 2){
                cur++;
            } else {
                cur = 1;
            }

            res = Math.max(res, cur);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        int result = longestEvenOddSubArray(arr);
        System.out.println(result);
    }
}