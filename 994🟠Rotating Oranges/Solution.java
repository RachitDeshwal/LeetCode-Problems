class Solution {
  public int orangesRotting(int[][] grid) {
      Queue<int[]> queue=new LinkedList<>();
      int freshcount=0;
      int m=grid.length;
      int n=grid[0].length;
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              if(grid[i][j]==1){
                  freshcount++;
              }
              else if(grid[i][j]==2){
                  queue.offer(new int[]{i,j});
              }
          }
      }
      if(freshcount==0){
          return 0;
      }
      int minutes=0;
      while(!queue.isEmpty()){
          int size=queue.size();
          for(int i=0;i<size;i++){
              int rotten[]=queue.poll();
              int r=rotten[0];
              int c=rotten[1];
              int neighbours[][]={{r-1,c},{r,c+1},{r,c-1},{r+1,c}

              };
              for(int neighbour[]:neighbours){
                  int nr=neighbour[0];
                  int nc=neighbour[1];
                  if(nr<0||nc<0||nr>=m||nc>=n||grid[nr][nc]!=1){
                      continue;
                  }
                  grid[nr][nc]=2;
                  queue.offer(new int[]{nr,nc});
                  freshcount--;
                  if(freshcount==0){
                      return minutes+1;
                  }
              }
          }
          minutes++;
      }
       return -1;
      
  }
 
}