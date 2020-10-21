class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i=0; i<asteroids.length; i++){
            if (stack.isEmpty() || asteroids[i]>0){
                stack.push(asteroids[i]);
            } else {
                
                while (true){
                    int top=stack.peek();
                    
                    if (top>-asteroids[i]) {
                        break;
                    } else if(top==-asteroids[i]) {
                        stack.pop();
                        break;
                    } else if(top<0) {
                        stack.push(asteroids[i]);
                        break;
                    } else {
                        stack.pop();
                        if(stack.isEmpty()){
                            stack.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        
        int result[]= new int[stack.size()];
        
        for (int i=stack.size()-1; i>=0; i--){
            result[i]=stack.pop();
        }
        
        return result;
    }
}