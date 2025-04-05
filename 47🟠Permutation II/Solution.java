class Solution {
  public List<List<Integer>> permuteUnique(int[] nums) {
      List<List<Integer>> ans=new ArrayList<>();
      Arrays.sort(nums);
     backtrack(ans,new ArrayList<>(),new boolean[nums.length],nums);
     return ans;
      
  }
  public void backtrack(List<List<Integer>> ans,ArrayList<Integer> temp,boolean used[],int nums[]){
      if(temp.size()==nums.length){
          if(!ans.contains(temp)){
              ans.add(new ArrayList<>(temp));
          }
          return;
      }
      for(int i=0;i<nums.length;i++){
          if(used[i]){
              continue;
          }
          temp.add(nums[i]);
          used[i]=true;
          backtrack(ans,temp,used,nums);
          used[i]=false;
          temp.remove(temp.size()-1);
      }
      
}
}