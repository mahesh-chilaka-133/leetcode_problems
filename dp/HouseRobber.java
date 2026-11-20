package dp;

import java.util.Arrays;

public class HouseRobber {
   
    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        return solve(nums, 0, dp);
    }

    public int solve(int[] nums, int index, int[] dp) {

        if (index >= nums.length){
            return 0;
        }

        if (dp[index] != -1){
            return dp[index];
        }

        int pick = nums[index] + solve(nums, index + 2, dp);

        int notPick = solve(nums, index + 1, dp);

        dp[index] =  Math.max(pick, notPick);

        return dp[index];

    }


}
