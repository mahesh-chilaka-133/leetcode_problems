package arrays;

public class ConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int cur = 0;

        for(int i = 0 ;i < nums.length;i++){
            if(nums[i] == 0){
                cur = 0;
            }else{
                cur++;
                count = Math.max(count,cur);
            }
                
            }
            return count;
        }
        
    }
 {
    
}
