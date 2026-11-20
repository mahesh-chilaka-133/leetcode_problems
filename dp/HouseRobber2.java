package dp;

import java.util.Arrays;

public class HouseRobber2 {
    
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1){
            return nums[0];
        }
        
        int dp1[] = new int[n];
        int dp2[] = new int[n];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int case1 = solve(nums, 0, n - 2, dp1);
        int case2 = solve(nums, 1, n - 1, dp2);

        return Math.max(case1, case2);
    }

    public int solve(int[] nums, int start, int index, int[] dp){

        if (index < start){
            return 0;
        }

        if (dp[index] != -1){
            return dp[index];
        }

        int pick = nums[index] + solve(nums, start, index - 2, dp);

        int notPick = solve(nums, start, index - 1, dp);

        return dp[index] = Math.max(pick, notPick);

    }
        

}
