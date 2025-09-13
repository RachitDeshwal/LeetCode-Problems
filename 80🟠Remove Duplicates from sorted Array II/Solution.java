class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int k=0;
        if(n==1||n==2){
            return n;
        }
        int freq=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                freq++;
            }
            else{
                freq=1;
            }
            if(freq<3){
                k++;
                nums[k]=nums[i];
            }
        }
        return ++k;
        
    }
}