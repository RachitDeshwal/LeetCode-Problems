class Solution {
  public String minWindow(String s, String t) {
      int m=s.length();
      int n=t.length();
      HashMap<Character, Integer> freqMap=new HashMap<>();
      for(int i=0;i<n;i++){
          char ch=t.charAt(i);
          freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
      }
      int windowstart=0;
      int windowend=0;
      int uniquecharcount=freqMap.size();
      int startindex=-1;
      int minlength=Integer.MAX_VALUE;
      //expansion phase
      while(windowend<m){
          char ch=s.charAt(windowend);
          if(freqMap.containsKey(ch)){
              freqMap.put(ch,freqMap.getOrDefault(ch,0)-1);
              if(freqMap.get(ch)==0){
                  uniquecharcount--;
              }
          }
          while(uniquecharcount==0){
              //shrinking phase
              int len=windowend-windowstart+1;
              if(len<minlength){
                  minlength=len;
                  startindex=windowstart;
              }
              ch=s.charAt(windowstart);
              if(freqMap.containsKey(ch)){
                  freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
                  if(freqMap.get(ch)>0){
                      uniquecharcount++;

                  }
              }
              windowstart++;

          }
          windowend++;
      }
      if(startindex==-1){
          return "";
      }
      else{
      return s.substring(startindex,startindex+minlength);
      
      }
      
  }
