class Solution {
  int level=1;
  int maxsum=Integer.MIN_VALUE;
  Queue<TreeNode> q=new LinkedList<>();
  public int maxLevelSum(TreeNode root) {
      q.add(root);
      levelOrderTraversal(root);
      return maxsum;
      
  }
  public void levelOrderTraversal(TreeNode root){
      int sum=Integer.MIN_VALUE;
      while(!q.isEmpty()){
          int size=q.size();
          int tempsum=0;
          for(int i=0;i<size;i++){
              TreeNode curr=q.remove();
              if(curr.left!=null){
                  q.add(curr.left);
              }
              if(curr.right!=null){
                  q.add(curr.right);
              }
              tempsum+=curr.val;
          }
          if(tempsum>sum){
              sum=tempsum;
              maxsum=level;
          }
          level++;
      }
  }
}