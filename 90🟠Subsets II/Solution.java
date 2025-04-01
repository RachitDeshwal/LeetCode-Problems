class Solution {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
      Arrays.sort(nums);
      List<List<Integer>> ans=new ArrayList<>();
      backtracking(ans,new ArrayList<>(),nums,0);
      return ans;
      
  }
  public void backtracking(List<List<Integer>> ans, ArrayList<Integer> temp,int nums[],int start){
     if(!ans.contains(temp)){
              ans.add(new ArrayList<>(temp));
          }
      if(start==nums.length){
         
          return;
      }
       
      
          temp.add(nums[start]);
          backtracking(ans,temp,nums,start+1);
          temp.remove(temp.size()-1);
          backtracking(ans,temp,nums,start+1);
      
  }
}