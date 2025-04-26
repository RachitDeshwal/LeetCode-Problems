class Solution {
  Queue<TreeNode> q=new LinkedList<>();
  public List<Integer> rightSideView(TreeNode root) {
      ArrayList<Integer> list=new ArrayList<>();
      if(root==null){
          return list;
      }
       q.add(root);
      list=levelOrderTraversal(root);

     
     
      
      return list;

      
  }
  public ArrayList<Integer> levelOrderTraversal(TreeNode root){
      ArrayList<Integer> ans=new ArrayList<>();
      
     
      while(!q.isEmpty()){
           ArrayList<Integer> temp=new ArrayList<>();
          int size=q.size();
      for(int i=0;i<size;i++){
          TreeNode curr=q.remove();
          temp.add(curr.val);
          if(curr.left!=null){
              q.add(curr.left);

          }
          if(curr.right!=null){
              q.add(curr.right);
          }
      }
      ans.add(temp.get(temp.size()-1));
      }
      return ans;
      
  }

}