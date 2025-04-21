class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> ans=new ArrayList<>();
      if(root==null){
          return ans;

      }
      Queue<TreeNode> q=new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()){
          int levelsize=q.size();
          ArrayList<Integer> temp=new ArrayList<>();
          for(int i=0;i<levelsize;i++){
              TreeNode curr=q.remove();
              temp.add(curr.val);
              if(curr.left!=null){
                  q.add(curr.left);
              }
              if(curr.right!=null){
                  q.add(curr.right);
              }
          }
          ans.add(new ArrayList<>(temp));
      }
      return ans;
      
  }
}