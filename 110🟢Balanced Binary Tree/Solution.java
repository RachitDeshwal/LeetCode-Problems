class Solution {
  boolean ans=true;
  public boolean isBalanced(TreeNode root) {
      heightOfTree(root);
      return ans;

      
  }
  public int heightOfTree(TreeNode root){
      if(root==null){
          return 0;
      }
      int lh=heightOfTree(root.left);
      int rh=heightOfTree(root.right);
      int diff=lh-rh;
      if(diff>1||diff<-1){
          ans=false;
      }
      return Math.max(lh,rh)+1;


  }
}