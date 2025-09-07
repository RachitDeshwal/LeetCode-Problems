class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalTime=0;
        int i=1;
        int prev=0;
        while(i<colors.length()){
            if(colors.charAt(i)==colors.charAt(prev)){
                if(neededTime[i]>=neededTime[prev]){
                    totalTime+=neededTime[prev];
                    prev=i;
                }
                else{
                    totalTime+=neededTime[i];
                    
                }
            }
            else{
                prev=i;
            }
            i++;
        }
        return totalTime;
    }
}