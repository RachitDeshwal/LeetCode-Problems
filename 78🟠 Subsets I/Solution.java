class Solution {
  public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> ans=new ArrayList<>();
      backtracking(ans,new ArrayList<>(),nums,0);
      return ans;
      
  }
  public void backtracking(List<List<Integer>> ans,ArrayList<Integer> temp,int []nums,int start){
      ans.add(new ArrayList<>(temp));
      if(start==nums.length){
          return;
      }
      for(int i=start;i<nums.length;i++){
          temp.add(nums[i]);
          backtracking(ans,temp,nums,i+1);
          temp.remove(temp.size()-1);
      }
  }
}