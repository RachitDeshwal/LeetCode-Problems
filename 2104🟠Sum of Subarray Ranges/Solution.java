class Solution {
    public long subArrayRanges(int[] nums) {
        long sum=0;
        for(int i=1;i<nums.length;i++){
            sum+=count(nums,i);
        }
        return sum;
        
    }
    public static long count(int []nums,int i){
        int j=i;
        long sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(j>=0){
            if(nums[j]>max){
                max=nums[j];
            }
            if(nums[j]<min){
                min=nums[j];
            }
            sum+=(long)(max-min);
            j--;

        }
        return sum;
    }
}