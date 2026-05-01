package arrays;
class MinOperToX {
    public int minOperations(int[] nums, int x) {
        
        int n = nums.length;
        int totalSum = 0;
        int prefixSum = 0,  maxLength = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for (int num : nums) totalSum += num; 

        int target = totalSum - x;

        if ( target < 0)  return -1; 
        if (target == 0) return n;  
        
        for ( int j = 0; j < n; j++){
           prefixSum  += nums[j];

           if ( map.containsKey(prefixSum - target)) {
            int i = map.get(prefixSum - target);
            maxLength = Math.max(maxLength, j - i);
           }

            if(!map.containsKey(prefixSum)){
                map.put(prefixSum,j);
            
           }
        }
        return maxLength == -1 ? -1 : n - maxLength;
    }
}