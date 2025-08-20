class Solution {
    public String reorganizeString(String s) {
       int count[]=new int[26];
       for(int i=0;i<s.length();i++){
        count[s.charAt(i)-'a']++;
       }
       int letter=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<26;i++){
        if(count[i]>max){
            max=count[i];
            letter=i;
        }
        
       }
       if(max>(s.length()+1)/2){
        return "";
       }
       char[] res=new char[s.length()];
       int idx=0;
       while(count[letter]-->0){
        res[idx]=(char)(letter+'a');
        idx+=2;

       }
       for(int i=0;i<26;i++){
        while(count[i]-->0){
            if(idx>=res.length){
                idx=1;
            }
            res[idx]=(char)(i+'a');
            idx+=2;
        }
       }
       return String.valueOf(res);
        
    }
}