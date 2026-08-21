class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;  
        int columns = matrix[0].length;
        List<Integer>list= new ArrayList<>();

        int top = 0;
        int left = 0;
        int bottom = rows - 1;
        int right = columns - 1;
    
        while (top <= bottom && left <= right){
            //top
            for (int j = left; j <= right; j++){
                    list.add(matrix[top][j]);
            }
            top++;
            // right
            for (int i = top; i <= bottom; i++){
                    list.add(matrix[i][right]);
            }
            right--;

            //bottom
            if (top <= bottom){
                for (int j = right; j >= left; j--){
                        list.add(matrix[bottom][j]);
                }
                bottom--;
            }
            // left
            if (left <= right){
                for (int i = bottom; i >= top; i--){
                        list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}