class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==2){
            return (nums[0]-1)*(nums[1]-1);
        }
        int sm=0;
        int lg=0;
        if(nums[0]>=nums[1]){
             sm=nums[1];
             lg=nums[0];
        }
        else{
             sm=nums[0];
             lg=nums[1];
        }
        for(int i=2;i<nums.length;i++){
            if(nums[i]>lg){
                sm=lg;
                lg=nums[i];
                continue;
                

            }
            if(nums[i]==lg){
                sm=lg;
                continue;
            }
            if(nums[i]<lg&&nums[i]>sm){
                sm=nums[i];
            }
        }
        return (sm-1)*(lg-1);
        
    }
}