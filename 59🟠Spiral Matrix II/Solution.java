class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        int val=1;
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        while(top<=bottom&&left<=right){
            //top
            for(int i=left;i<=right;i++){
                arr[top][i]=val;
                val++;
            }
            //for right;
            for(int i=top+1;i<=bottom;i++){
                arr[i][right]=val;
                val++;
            }
            //for bottom
            for(int i=right-1;i>=left;i--){
                if(top==bottom){
                    break;
                }
                arr[bottom][i]=val;
                val++;
            }
            //for left
            for(int i=bottom-1;i>top;i--){
                if(left==right){
                    break;
                }
                arr[i][left]=val;
                val++;
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return arr;
        
    }
}