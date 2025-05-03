class Solution {
  int max=Integer.MIN_VALUE;
  public int maxPathSum(TreeNode root) {
      findMaxPath(root);
     return max;

      
  }
  public int findMaxPath(TreeNode root){
      if(root==null){
          return 0;
      }
      int left=findMaxPath(root.left);
      int right=findMaxPath(root.right);
      int temp=Math.max(Math.max(left,right)+root.val,root.val);
      max=Math.max(Math.max(left+right+root.val,temp),max);
      return temp;
  }
}