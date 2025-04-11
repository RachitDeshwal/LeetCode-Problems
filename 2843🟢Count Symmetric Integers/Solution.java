class Solution {
  public int countSymmetricIntegers(int low, int high) {
      int count=0;
      for(int num=low;num<=high;num++){
          String s=Integer.toString(num);
          int len=s.length();
          if(len%2!=0){
              continue;
          }
          int n=len/2;
          int firsthalf=0;
          int secondhalf=0;
          for(int i=0;i<n;i++){
              firsthalf+=s.charAt(i)-'0';
          }
          for(int i=s.length()-1;i>=s.length()-n;i--){
              secondhalf+=s.charAt(i)-'0';
              
          }
          if(secondhalf==firsthalf){
              count++;
          }

      
      
      
  }
  return count;
}
}