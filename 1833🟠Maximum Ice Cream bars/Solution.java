class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxValue=costs[0];
        int n=costs.length;
        int totalIceCream=0;
        for(int i=1;i<n;i++){
            maxValue=Math.max(maxValue,costs[i]);
        }
        int freq[]=new int[maxValue+1];
        for(int i=0;i<n;i++){
            freq[costs[i]]++;
        }
        int sortCosts[]=new int[n];
        int k=0;
        for(int i=0;i<=maxValue;i++){
            while(freq[i]>0){
                sortCosts[k++]=i;
                freq[i]--;
            }
        }
        int i=0;
        while(i<n&&coins>0){
            if(sortCosts[i]<=coins){
                coins-=sortCosts[i];
                totalIceCream++;
            }
            else{
                break;
            }
            i++;
        }
        return totalIceCream;

    }
}