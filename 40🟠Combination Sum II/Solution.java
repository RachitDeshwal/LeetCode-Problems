class Solution {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      Arrays.sort(candidates);
      ArrayList<Integer> curr=new ArrayList<>();
      List<List<Integer>> res=new ArrayList<List<Integer>>();
      recur(candidates,target,0,curr, res);
      return res;
      
  }
  public void recur(int []candidates, int target,int start,ArrayList<Integer> curr, List<List<Integer>> res){
      //base case
     if(target==0){
      res.add(new ArrayList<Integer>(curr));
      return;
     }
     if(target<0){
      return ;
     }
     for(int i=start;i<candidates.length;i++){
     if((i==start||candidates[i-1]!=candidates[i])&&target>=candidates[i]){
      curr.add(candidates[i]);
      recur(candidates,target-candidates[i],i+1,curr,res);
      curr.remove(curr.size()-1);
     }

     }

  }
}