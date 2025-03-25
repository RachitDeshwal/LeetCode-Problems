class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {

      List<List<Integer>> res=new ArrayList<List<Integer>>();
      ArrayList<Integer> curr=new ArrayList<>();
      recur(candidates,target,curr,0,res);
      return res;
  }
  public void recur(int candidates[],int target, ArrayList<Integer> curr,int idx,List<List<Integer>> res){
      //base case
      if(idx==candidates.length){
          if(target==0){
              res.add(new ArrayList<Integer>(curr));
          }
           return;
      }
      //pick
      if(candidates[idx]<=target){
          curr.add(candidates[idx]);
          recur(candidates,target-candidates[idx],curr,idx,res);
          curr.remove(curr.size()-1);
      }
      //not pick
      recur(candidates,target,curr,idx+1,res);
     
  }
}