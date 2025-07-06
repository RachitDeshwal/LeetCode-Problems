class Solution {
  public int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);
      
      int ans=Integer.MAX_VALUE;
      for(int i= 0;i<nums.length-2;i++){
          int left=i+1;
          int right=nums.length-1;
          while(left<right){
              int sum=nums[i]+nums[left]+nums[right];
              if(sum==target){
                  return sum;
              }
              else if(sum<target){
                  if(Math.abs(sum-target)<Math.abs(target-ans)){
                      ans=sum;
                  }

                  left++;
              }
              
              else{
                if(Math.abs(sum-target)<Math.abs(target-ans)){
                      ans=sum;
                  }
                  right--;

              }
              
          }
      }
      return ans;
      
  }
}