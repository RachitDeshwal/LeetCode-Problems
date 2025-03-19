class Solution {
  public String longestPrefix(String s) {
      char ch[]=s.toCharArray();
      int n=ch.length;
      int i=1;
      int max=0;
      int arr[]=new int[n];
      arr[0]=0;
      while(i<n){
          if(ch[max]==ch[i]){
              max++;
              arr[i]=max;
              i++;
          }
          else if(max>0){
              max=arr[max-1];

          }
          else{
              arr[i]=0;
              i++;
          }
      }
      return s.substring(0,arr[n-1]); 

      
      
  }
}