class Solution {
  public int[] searchRange(int[] nums, int target) {
     
      int i=-1;
      int j=-1;
      int left=0;
      int right=nums.length-1;
      while(left<=right){
          int mid=(right+left)/2;
          if(target==nums[mid]){
              i=mid;
              j=mid;
              while(i>0&&nums[i-1]==nums[i]){
                  i--;
              }
              while(j<nums.length-1&&nums[j+1]==nums[j]){
                  j++;
              }
              return new int[] {i,j};

          }
          else if(target>=nums[left]&&target<nums[mid]){
              right=mid-1;
          }
          else{
              left=mid+1;
          }
      }
      return new int[] {i,j};
      
  }
}