package arrays;

public class NextPermutation {
     public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // 1. Find the first smaller element from the right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // 2. Find the smallest element greater than nums[i]
        if (i >= 0) {

            int j = nums.length - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            // 3. Swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // 4. Reverse the suffix
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
      
           }   }
}
