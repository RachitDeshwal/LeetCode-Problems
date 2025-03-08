class Solution {
  public int largestRectangleArea(int[] heights) {
      Stack<Integer> s=new Stack<>();
      int n=heights.length;
      int maxarea=Integer.MIN_VALUE;
      for(int i=0;i<=n;i++){
          int element=(i==n)?0:heights[i];
          while(!s.isEmpty()&&heights[s.peek()]>element){
              int h=heights[s.pop()];
              int nextsmallest=i;
              int previousmallest=(s.isEmpty())?-1:s.peek();
              int wid=nextsmallest-previousmallest-1;
              maxarea=Math.max(wid*h,maxarea);

              
          }
          s.push(i);
      }
      return (maxarea==Integer.MIN_VALUE)?0:maxarea;
      
  }
}