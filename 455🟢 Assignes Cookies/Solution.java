class Solution {
  public int findContentChildren(int[] g, int[] s) {
      Arrays.sort(g);
      Arrays.sort(s);
      int i=0;
      int j=0;
      int max=0;
      while(i<g.length&&j<s.length){
          if(s[j]>=g[i]){
              max++;
              j++;
              i++;
          }
          else{
              j++;
          }
      }
      return max;
      
  }
}