class Solution {
    public int wiggleMaxLength(int[] nums) {
        int totalSub=0;
        boolean pos=false;
        boolean neg=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]>0){
                if(!pos){
                    totalSub++;
                    neg=false;
                    pos=true;
                }
                continue;
            }
            else if(nums[i]-nums[i-1]<0){
                if(!neg){
                    totalSub++;
                    neg=true;
                    pos=false;
                }
            }
        }
        return ++totalSub;
    
        
    }
}