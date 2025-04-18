class Solution {
  public int canCompleteCircuit(int[] gas, int[] cost) {
      int totalcost=0;
      int totalgas=0;
      for(int i=0;i<gas.length;i++){
          totalcost+=cost[i];
          totalgas+=gas[i];
      }
      if(totalcost>totalgas){
          return -1;

      }
      int currgas=0;
      int start=0;
      for(int i=0;i<gas.length;i++){
          currgas+=gas[i]-cost[i];
          if(currgas<0){
              currgas=0;
              start=i+1;
          }
      }
      return start;
      
  }
}