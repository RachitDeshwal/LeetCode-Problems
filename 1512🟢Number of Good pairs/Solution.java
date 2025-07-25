class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodpairs=0;
        int count[]=new int[102];
        for(int num:nums){
            count[num]++;
        }
        for(int i:count){
            goodpairs+=i*(i-1)/2;
        }
        return goodpairs;
    }
}