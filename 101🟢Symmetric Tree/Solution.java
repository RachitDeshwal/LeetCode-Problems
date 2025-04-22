class Solution {
  public boolean isSymmetric(TreeNode root) {
      
      boolean ans=isMirorImage(root,root);
      
      return ans;
      
  }
  public boolean isMirorImage(TreeNode root1,TreeNode root2){
      if(root1==null&&root2==null){
          return true;
      }
      if(root1==null||root2==null){
          return false;
      }
     
      
      
      
      return root1.val==root2.val&&isMirorImage(root1.left,root2.right)&&isMirorImage(root1.right,root2.left);

      
  }
}