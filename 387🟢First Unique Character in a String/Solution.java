class Solution {
  public int firstUniqChar(String s) {
      int freq[]=new int[26];
      Queue<Character> q=new LinkedList<>();
      for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          freq[ch-'a']++;
          q.add(ch);
      }
      while(!q.isEmpty()&&freq[q.peek()-'a']>1){
          q.remove();
      }
      if(q.isEmpty()){
          return -1;
      }
      int count=-1;
      for(int i=0;i<s.length();i++){
          if(freq[s.charAt(i)-'a']==1){
              count=i;
              break;
          }
      }
      return count;
      
  }
}