class Solution {
  public List<Integer> postorderTraversal(TreeNode root) {
      ArrayList<Integer> list=new ArrayList<>();
      postorderTraverse(root,list);
      return list;
      
  }
  public void postorderTraverse(TreeNode root,ArrayList<Integer> list){
      if(root==null){
          return ;
      }
      postorderTraverse(root.left,list);
      postorderTraverse(root.right,list);
      list.add(root.val);
  }
}