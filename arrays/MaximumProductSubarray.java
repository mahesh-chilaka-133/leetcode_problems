package arrays;

public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        
        int minProd = nums[0];
        int maxProd = nums[0];
        int result = nums[0];

        for ( int i = 1; i < nums.length; i++) {
            
            if (nums[i] < 0){
                int temp = minProd;
                minProd = maxProd;
                maxProd = temp;
            }

            maxProd = Math.max(maxProd * nums[i], nums[i]);
            minProd = Math.min(minProd * nums[i], nums[i]);
            result = Math.max(result,maxProd); 
        }
        return result;
    }

}
