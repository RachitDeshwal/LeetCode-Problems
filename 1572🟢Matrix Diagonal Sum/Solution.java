class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        int i=0,j=0;
        while(i<n&&j<n){
            sum+=mat[i][j];
            i++;
            j++;
        }
        i=0;
        j=n-1;
        while(i<n&&j>=0){
            if(n%2!=0&&i==n/2){
                 i++;
                 j--;
                continue;
            }
            sum+=mat[i][j];
            i++;
            j--;
        }
        return sum;
        
    }
}