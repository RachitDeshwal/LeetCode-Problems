public class Solution {
    public static void rotate(int matrix[][]){
        int n=matrix.length;
        for(int i=0;i<(n+1)/2;i++){
            for(int j=0;j<n/2;j++){
                //bottom left
                int temp=matrix[n-1-j][i];
                //bottom left=bottom right
                matrix[n-1-j][i]=matrix[n-i-1][n-j-1];
                //bottom right=top right
                matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
                //top right=top left
                matrix[j][n-i-1]=matrix[i][j];
                //top left=bottom left
                matrix[i][j]=temp;
            }
        }

    }