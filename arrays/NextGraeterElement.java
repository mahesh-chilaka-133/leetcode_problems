class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Deque<Integer> stack = new ArrayDeque<>();

        int n = nums.length;
        int[] arr = new int[n];

        Arrays.fill(arr, -1);

        for (int i = 0; i < 2 * n; i++) {

            int currentIndex = i % n;

            while (!stack.isEmpty()
                    && nums[currentIndex] > nums[stack.peek()]) {

                int index = stack.pop();
                arr[index] = nums[currentIndex];
            }

            if (i < n) {
                stack.push(currentIndex);
            }
        }

        return arr;
    }
}