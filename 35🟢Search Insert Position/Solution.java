class Solution {
  public int searchInsert(int[] nums, int target) {
      int mid=1;
      int left=0;
      int right=nums.length-1;
      while(left<=right){
          mid=(left+right)/2;
          if(nums[mid]==target){
              return mid;
          }
          else if(target<nums[mid]&&target>=nums[left]){
              right=mid-1;
          }
          else if(target<nums[mid]&&target<nums[left]){
              return left;
              
          }
          else{
              left=mid+1;
          }
      }
      return mid+1;
  }
}