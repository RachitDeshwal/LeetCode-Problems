class Solution {
  public TreeNode buildTree(int[] inorder, int[] postorder) {
      HashMap<Integer,Integer> inOrderIndexMap=new HashMap<>();
      for(int i=0;i<inorder.length;i++){
          inOrderIndexMap.put(inorder[i],i);
      }
     return splitTree(postorder,inOrderIndexMap,postorder.length-1,0,inorder.length-1);
      
  }
  public TreeNode splitTree(int []postorder, HashMap<Integer,Integer> inOrderIndexMap,int rootIndex,int left,int right){
      TreeNode root=new TreeNode(postorder[rootIndex]);
      int mid=inOrderIndexMap.get(postorder[rootIndex]);
      if(mid>left){
          root.left=splitTree(postorder,inOrderIndexMap,rootIndex-right+mid-1,left,mid-1);
      }
      if(mid<right){
          root.right=splitTree(postorder,inOrderIndexMap,rootIndex-1,mid+1,right);
      }
      return root;

  }
}