class Solution {
  public boolean searchMatrix(int[][] matrix, int target) {
      int row=0;
      int bot=matrix.length-1;
      int mid;
      while(row<=bot){
           mid=(row+bot)/2;
          
          if(target==matrix[mid][0]){
              return true;
          }
          else if(target>matrix[mid][0]){
              row=mid+1;
          }
          else{
              bot=mid-1;
          }
      }
       row=(bot+row)/2;
      int left=0;
      int right=matrix[row].length-1;
      while(left<=right){
          mid=(left+right)/2;
          if(matrix[row][mid]==target){
              return true;
          }
          else if(matrix[row][mid]>target){
              right=mid-1;
          }
          else{
              left=mid+1;
          }
      }
      return false;
      
  }
}