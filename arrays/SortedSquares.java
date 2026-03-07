package arrays;
class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];
        int index = n - 1;
        int left = 0;
        int right = n - 1;

         while ( left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare < rightSquare){
                arr[index] = rightSquare;
                right--;
            }else{
                arr[index] = leftSquare;
                left++;
            }
            index--;
            
         }
        return arr;
    }
        
}
