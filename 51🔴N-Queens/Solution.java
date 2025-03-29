class Solution {
  public List<List<String>> solveNQueens(int n) {
      char[][] board=new char[n][n];
      List<List<String>> ans=new ArrayList<>();
      for(int i=0;i<n;i++){
          Arrays.fill(board[i],'.');
      }
      nQueens(board, ans,0,n);
      return ans;
      
  }
  public void nQueens(char[][] board,List<List<String>> ans, int row, int n){
      if(row==n){
          List<String> solution=new ArrayList<>();
          for(char[] rowArray: board){
              solution.add(new String(rowArray));
          }
          ans.add(solution);
          return;
      }
      for(int col=0;col<n;col++){
          if(isSafe(board,row,col,n)){
              board[row][col]='Q';
              nQueens(board,ans,row+1,n);
              board[row][col]='.';
          }

      }
      
  }
  public boolean isSafe(char[][] board,int row,int col,int n){
      //Horizontal check
      for(int i=0;i<n;i++){
          if(board[row][i]=='Q'){
              return false;
          }
      }
      //vertical check
      for(int i=0;i<n;i++){
          if(board[i][col]=='Q'){
              return false;
          }
      }
      //for left diagonal
      for(int i=row-1, j=col-1;i>=0&&j>=0;i--,j--){
          if(board[i][j]=='Q'){
              return false;
          }
      }
      //for right diagonal
       for(int i=row-1, j=col+1;i>=0&&j<n;i--,j++){
          if(board[i][j]=='Q'){
              return false;
          }
      }
      return true;

  }
}