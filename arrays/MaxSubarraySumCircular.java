package arrays;
class MaxSubarraySumCircular {
    public int maxSubarraySumCircular(int[] nums) {

        int maxNormal = normalMax(nums);

        if (maxNormal < 0){
            return maxNormal;
        }
        int arrSum = 0;
        for (int i = 0;i < nums.length;i++){
            arrSum += nums[i];
            nums[i] = -nums[i];
        }
        int maxCircular = arrSum + normalMax(nums);
        return Math.max(maxCircular,maxNormal);
    }

     public int normalMax(int[] nums){
            int res = nums[0];
            int curSum = nums[0];
            for (int i = 1;i < nums.length;i++){
                curSum = Math.max(nums[i],curSum+nums[i]);
                res = Math.max(res,curSum);
            }
            return res;
        }
 
    public int maxSubarraySumCircular(int[] nums) {
        
       

        int maxNormal = normalMax(nums);

        if (maxNormal < 0){
            return maxNormal;
        }
        int arrSum = 0;
        for (int i = 0;i < nums.length;i++){
            arrSum += nums[i];
            nums[i] = -nums[i];
        }
        int maxCircular = arrSum + normalMax(nums);
        return Math.max(maxCircular,maxNormal);
    }

}
