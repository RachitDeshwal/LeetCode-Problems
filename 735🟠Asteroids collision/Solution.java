class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s1=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(s1.isEmpty()){
                s1.push(asteroids[i]);
                continue;
            }
            else if(asteroids[i]>0){
                s1.push(asteroids[i]);
            }
            else if(asteroids[i]<0){
                if(s1.peek()<0){
                    s1.push(asteroids[i]);
                    continue;
                }
                else if(Math.abs(asteroids[i])==s1.peek()){
                    s1.pop();
                    continue;
                }
                else if((Math.abs(asteroids[i])>s1.peek())&&s1.peek()>0){
                    while(!s1.isEmpty()&&(Math.abs(asteroids[i])>s1.peek())&&s1.peek()>0){
                        s1.pop();
                    }
                    if(!s1.isEmpty()&&(Math.abs(asteroids[i])==s1.peek())){
                    s1.pop();
                    continue;
                    
                }
                    if(s1.isEmpty()||s1.peek()<0){
                        s1.push(asteroids[i]);
                    }

                }
                else{
                    continue;

                }

            }
        }
        int arr[]=new int[s1.size()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=s1.pop();
        }
        return arr;
    }
}