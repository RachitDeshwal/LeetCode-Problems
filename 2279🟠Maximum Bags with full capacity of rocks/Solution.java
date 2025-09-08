class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int maxBags=0;
        int n=capacity.length;
        int diff[]=new int[n];
        for(int i=0;i<n;i++){
            diff[i]=capacity[i]-rocks[i];
        }
        int i=0;
        Arrays.sort(diff);
        while(i<n&&additionalRocks>0){
            if(additionalRocks>=diff[i]){
                maxBags++;
            }
            else{
                break;
            }
            additionalRocks-=diff[i];
            i++;

        }
        return maxBags;
        
    }
}