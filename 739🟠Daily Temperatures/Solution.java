class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[]=new int[temperatures.length];
        Stack<Integer>  s=new Stack<>();
        
        for(int i=temperatures.length-1;i>=0;i--){
            
            while(!s.isEmpty()&&temperatures[i]>=temperatures[s.peek()]){
                
                s.pop();
            }
            
            if(!s.isEmpty()&&temperatures[s.peek()]>temperatures[i]){
                ans[i]=s.peek()-i;
                
            }
            s.push(i);


        }
        return ans;
    }
}