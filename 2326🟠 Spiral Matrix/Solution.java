class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        int arr[][]=new int[m][n];
        while(top<=bottom&&left<=right){
            //top
            for(int i=left;i<=right;i++){
                if(head==null){
                    arr[top][i]=-1;

                }
                else{
                    arr[top][i]=head.val;
                    head=head.next;
                }
            }
            //right
            for(int i=top+1;i<=bottom;i++){
                if(head==null){
                    arr[i][right]=-1;

                }
                else{
                    arr[i][right]=head.val;
                    head=head.next;
                }

            }
            //bottom
            for(int i=right-1;i>=left;i--){
                if(top==bottom){
                    break;
                }
                if(head==null){
                    arr[bottom][i]=-1;

                }
                else{
                    arr[bottom][i]=head.val;
                    head=head.next;
                }
            }
            //left
            for(int i=bottom-1;i>top;i--){
                if(left==right){
                    break;
                }
                if(head==null){
                    arr[i][left]=-1;

                }
                else{
                    arr[i][left]=head.val;
                    head=head.next;
                }
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return arr;
        
    }
}