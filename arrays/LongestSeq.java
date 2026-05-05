package arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestSeq {
   
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int longest = 0;

        for ( int num: nums) {
            set.add(num);
        }

        for ( int num: set) {

            if (!set.contains(num - 1)) {

                int length = 1;
                int current = num;

                while ( set.contains(current + 1)) {
                    current++;
                    length++;
                }
                longest = Math.max(longest, length);

            }
        }
        return longest;
    }

}
