class Solution {
  int diameter=0;
  public int diameterOfBinaryTree(TreeNode root) {
      heightOfTree(root);
      return diameter;
      
  }
  public int heightOfTree(TreeNode root){
      if(root==null){
          return 0;
      }
      int lh=heightOfTree(root.left);
      int rh=heightOfTree(root.right);
      diameter=Math.max(diameter,lh+rh);

      return Math.max(lh,rh)+1;
  }
}
