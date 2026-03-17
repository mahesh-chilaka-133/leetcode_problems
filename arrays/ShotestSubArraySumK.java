package arrays;
import java.util.*;

class ShortestSubArraySumK {
    public int shortestSubarray(int[] nums, int k) {

        int n = nums.length;

        // Step 1: Prefix sum
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        // Step 2: Deque to store indices
        Deque<Integer> dq = new ArrayDeque<>();

        int minLen = Integer.MAX_VALUE;

        // Step 3: Process prefix array
        for (int j = 0; j <= n; j++) {

            // Check if we found valid subarray
            while (!dq.isEmpty() && prefix[j] - prefix[dq.peekFirst()] >= k) {
                minLen = Math.min(minLen, j - dq.pollFirst());
            }

            // Remove useless indices 
            while (!dq.isEmpty() && prefix[j] <= prefix[dq.peekLast()]) {
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(j);
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}