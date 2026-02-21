package arrays;

public class MaximumDiffernce {
    public int maximumDifference(int[] nums) {
        int res = -1;
        int minVal = nums[0];
        for (int j = 1; j < nums.length;j++){
            if (nums[j] > minVal){
            res = Math.max(res,nums[j] - minVal);
            }
            minVal = Math.min(minVal,nums[j]);
        }
        return res;
    }
 
    
}
