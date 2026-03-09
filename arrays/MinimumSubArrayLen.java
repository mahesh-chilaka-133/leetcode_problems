package arrays;

public class MinimumSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        while ( right < nums.length ) {
            windowSum += nums[right];
            while ( windowSum >= target){
                int count = (right - left) + 1;
                minLength = Math.min(minLength,count);
                windowSum -= nums[left];
                left++;
            }
            right++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

}
