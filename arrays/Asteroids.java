class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < asteroids.length; i++){
            int current = asteroids[i];
            boolean alive = true;
            while (!stack.isEmpty() && stack.peek() > 0 && current < 0){

                if (stack.peek() < Math.abs(current)){

                    stack.pop();
                }else if (stack.peek() == Math.abs(current)){
                    stack.pop();
                    alive = false;
                    break;
                }else{
                    alive = false;
                    break;
                }
            }
            if (alive){
                stack.push(current);
            }
        }
        int [] arr = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--){
            arr[i] = stack.pop();
        }
        return arr;

    }
}