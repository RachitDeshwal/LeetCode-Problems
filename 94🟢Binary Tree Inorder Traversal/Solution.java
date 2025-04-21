class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
      ArrayList<Integer> list=new ArrayList<>();
      inorderTraverse(root,list);
      return list;
      
  }
  public void inorderTraverse(TreeNode root,ArrayList<Integer> list){
      if(root==null){
          return ;
      }
      inorderTraverse(root.left,list);
      list.add(root.val);
      inorderTraverse(root.right,list);

  }
}