class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
      Set<List<Integer>> result=new HashSet<>();
      if(nums==null||nums.length<3){
          return new ArrayList<>();
      }
      Arrays.sort(nums);
      for(int i=0;i<nums.length-2;i++){
          int left=i+1;
          int right=nums.length-1;
          while(left<right){
              if(nums[i]+nums[left]+nums[right]==0){
                  result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                  left++;
                  right--;
              }
              else if((nums[i]+nums[left]+nums[right])>0){
                  right--;
              }
              else{
                  left++;
              }

          }
      }
      return new ArrayList<>(result);
      
  }
}