class Solution {
  boolean ans=true;
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
      if(root==null&&subRoot==null){
          return ans;
      }
      if(root==null||subRoot==null){
          return false;
      }
      if(root.val==subRoot.val){
          if(findSubtree(root,subRoot)){
              return true;
          }
      }
    
     
     return  isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot) ;

      
  }
  public boolean findSubtree(TreeNode root,TreeNode subRoot){
      if(subRoot==null&&root==null){
          ans=true;
          return ans ;
      }
      if(root==null||subRoot==null){
          return false;
      }
      return root.val==subRoot.val&&findSubtree(root.left,subRoot.left)&&findSubtree(root.right,subRoot.right);

  }
}