class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int res[]=new int[nums.length];
        int bucket[]=new int[102];
        for(int i=0;i<nums.length;i++){
            bucket[nums[i]]++;
        }
        for(int i=1;i<bucket.length;i++){
            bucket[i]+=bucket[i-1];
        }
        for(int i=0;i<res.length;i++){
            if(nums[i]==0){
                res[i]=0;
            }
            else{
                res[i]=bucket[nums[i]-1];
            }
        }
        return res;
        
    }
}