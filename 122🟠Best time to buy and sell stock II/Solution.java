class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int totalProfit=0;
        int n=prices.length;
        while(i<n-1){
            if(prices[i]<prices[i+1]){
                int j=i+1;
                while(j<n-1&&prices[j]<prices[j+1]){
                    j++;
                }
                 totalProfit+=prices[j]-prices[i];
                i=j+1;
               
            }
            else{
                i++;
            }

        }
        return totalProfit;
        
    }
}