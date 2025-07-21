class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while(top<=bottom&&left<=right){
            //top
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            //right
            
            for(int i=top+1;i<=bottom;i++){
                
                list.add(matrix[i][right]);
            
            }
            //bottom
            for(int i=right-1;i>=left;i--){
                if(top==bottom){
                    break;
                }
                list.add(matrix[bottom][i]);
            }
            //left
            for(int i=bottom-1;i>top;i--){
                if(left==right){
                    break;
                }
                list.add(matrix[i][left]);
            }
            top++;
            bottom--;
            left++;
            right--;

        }
        
        return list;
        
    }
}