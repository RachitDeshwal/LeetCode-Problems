class Solution {
  public void solveSudoku(char[][] board) {
      sudokuSolver(board,0,0);
      
  }
  public boolean sudokuSolver(char[][] board,int row,int col){
      //base case
      if(row==9){
          return true;
      }
      int nextRow=row;
      int nextCol=col+1;
      if(col+1==9){
          nextRow=row+1;
          nextCol=0;
      }
      //if already filled
      if(board[row][col]!='.'){
           return sudokuSolver(board,nextRow,nextCol);
      }
      //if not filled
      for(char digit='1';digit<='9';digit++){
          if(isValid(board,row,col,digit)){
              board[row][col]=digit;
              if(sudokuSolver(board,nextRow,nextCol)){
                  return true;
              }
                   board[row][col]='.';

              
             
          }
      }
      return false;

  }
  public boolean isValid(char[][] board,int row,int col, char digit){
      //for row and column
      for(int i=0;i<9;i++){
          if(board[i][col]==digit||board[row][i]==digit){
              return false;
          }
      }
      //for grid
      int startRow=(row/3)*3;
      int startCol=(col/3)*3;
      for(int i=startRow;i<startRow+3;i++){
          for(int j=startCol;j<startCol+3;j++){
              if(board[i][j]==digit){
                  return false;
              }
          }
      }
      return true;
  }
}
