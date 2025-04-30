class Solution {
  class Node{
      TreeNode node;
      int idx;
      public Node(TreeNode node,int idx){
          this.node=node;
          this.idx=idx;
      }
  }
  Queue<Node> q=new LinkedList<>();
  
  public int widthOfBinaryTree(TreeNode root) {
      int maxwidth=0;
      q.add(new Node(root,0));
      while(!q.isEmpty()){
          int size=q.size();
          int start=0;
          int end=0;
          for(int i=0;i<size;i++){
              Node currNode=q.remove();
              int index=currNode.idx;
              if(i==0){
                  start=index;
              }
              if(i==size-1){
                  end=index;
              }
              if(currNode.node.left!=null){
                  q.add(new Node(currNode.node.left,2*index));
              }
              if(currNode.node.right!=null){
                  q.add(new Node(currNode.node.right,2*index+1));
              }
          }
          maxwidth=Math.max(maxwidth,end-start+1);
      }
      return maxwidth;
      
  }
  
}