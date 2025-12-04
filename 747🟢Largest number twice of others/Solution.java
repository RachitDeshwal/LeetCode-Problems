class Solution {
    public int dominantIndex(int[] nums) {
        int larIdx=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[larIdx]){
                larIdx=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i==larIdx){
                continue;
            }
            if(nums[larIdx]<2*nums[i]){
                return -1;

            }
        }
        return larIdx;

        
    }
}