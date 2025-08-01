class Solution {
    public int[] sortedSquares(int[] nums) {
       
        int arr[]=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(Math.abs(nums[left])<=Math.abs(nums[right])){
                arr[i]=nums[right]*nums[right--];
            }
            else{
                arr[i]=nums[left]*nums[left++];
            }

        }
        return arr;
        
    }
}