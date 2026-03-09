package arrays;

public class MaximumSubArraySum {
    
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;

        for (int i = 0;i < k; i++ ){
            windowSum += nums[i];
        }
        int maxWindowSum = windowSum;

        for (int i = k; i < nums.length; i++){
            windowSum += nums[i];
            windowSum -= nums[i - k];
            maxWindowSum = Math.max(windowSum,maxWindowSum);
        }
        return (double) maxWindowSum / k;
        
    }
}

