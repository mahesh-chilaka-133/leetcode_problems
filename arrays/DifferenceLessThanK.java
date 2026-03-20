package arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class DifferenceLessThanK {
   
    public int longestSubarray(int[] nums, int limit) {

        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();
        
        int i = 0;
        int maxLength = 0;
        
        for (int j = 0; j < nums.length; j++) {

            //maintaing maxDeque
            while (!maxDeque.isEmpty() && maxDeque.peekLast() < nums[j]) {
                maxDeque.pollLast();
            }
            maxDeque.addLast(nums[j]);

            //maintaining minDeque
            while (!minDeque.isEmpty() && minDeque.peekLast() > nums[j]) {
                minDeque.pollLast();
            }
            minDeque.addLast(nums[j]);

             // shrinking the window 
            while (!maxDeque.isEmpty() && !minDeque.isEmpty() && 
            maxDeque.peekFirst() - minDeque.peekFirst() > limit) {
                if (nums[i] == maxDeque.peekFirst()) {
                    maxDeque.pollFirst();
                }

                if (nums[i] == minDeque.peekFirst()) {
                    minDeque.pollFirst();
                }
                i++;
            }
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return maxLength;
    } 

}
