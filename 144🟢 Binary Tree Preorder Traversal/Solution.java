class Solution {
  public List<Integer> preorderTraversal(TreeNode root) {
      ArrayList<Integer> list=new ArrayList<>();
      
     preorderTraverse(list,root);
      return list;

      
  }
  public void preorderTraverse(ArrayList<Integer>list, TreeNode root){
      if(root==null){
          return ;
      }
      list.add(root.val);
      preorderTraverse(list,root.left);
      preorderTraverse(list,root.right);
  }
}