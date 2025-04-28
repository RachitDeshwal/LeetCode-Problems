class Solution {
  int maxdepth=-1;
  int ans=0;
  public int findBottomLeftValue(TreeNode root) {
      dfs(root,0);
      return ans;
      
  }
  public void dfs(TreeNode root,int depth){
      if(root==null){
          return ;
      }
      if(depth>maxdepth){
          maxdepth=depth;
          ans=root.val;
      }
      dfs(root.left,depth+1);
      dfs(root.right,depth+1);
     
      
  }
}