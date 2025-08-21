class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        StringBuilder sb=new StringBuilder();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length;i++){
            sb=new StringBuilder(str[i]).reverse();
            res.append(sb).append(" ");
        }
        return res.toString().trim();

        
        
        
    }
   
}