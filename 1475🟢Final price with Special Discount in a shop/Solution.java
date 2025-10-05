class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int res[]=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&s.peek()>prices[i]){
                s.pop();
            }
            if(s.isEmpty()){
                res[i]=prices[i];
                s.push(prices[i]);
            }
            else{
                res[i]=prices[i]-s.peek();
                s.push(prices[i]);
            }

        }
        return res;
        
        
    }
}