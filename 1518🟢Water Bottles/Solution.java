class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalUse=numBottles;
        while(numBottles>=numExchange){
            totalUse+=numBottles/numExchange;
            int r=numBottles%numExchange;
            numBottles/=numExchange;
            numBottles+=r;
        }
        return totalUse;
        
    }
}