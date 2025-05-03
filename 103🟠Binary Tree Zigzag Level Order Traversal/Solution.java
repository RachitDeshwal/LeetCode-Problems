

class Solution {
  int zigzag=0;
  Deque<TreeNode> q=new ArrayDeque<>();
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>>  res=new ArrayList<>();
       if(root==null){
          return res;
       }
      q.add(root);
     
      while(!q.isEmpty()){
           ArrayList<Integer> temp=new ArrayList<>();
          int size=q.size();
          for(int i=0;i<size;i++){
             
              if(zigzag%2==0){
                  TreeNode curr=q.removeFirst();
                  temp.add(curr.val);
                  if(curr.left!=null){
                      q.addLast(curr.left);
                  }
                  if(curr.right!=null){
                      q.addLast(curr.right);
                  }



              }
              else{
                  TreeNode curr=q.removeLast();
                  temp.add(curr.val);
                  if(curr.right!=null){
                      q.addFirst(curr.right);
                  }
                  if(curr.left!=null){
                      q.addFirst(curr.left);
                  }
              }
          }
          zigzag++;
          res.add(new ArrayList<>(temp));
      }
      return res;
      
  }
}