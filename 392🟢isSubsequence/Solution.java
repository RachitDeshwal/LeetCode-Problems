class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(j==t.length()){
                return false;
            }
            while(j<t.length()){
                if(ch==t.charAt(j)){
                    j++;
                    break;
                }
                j++;
                if(j==t.length()){
                    return false;
                }
            }
            

        }
        return true;
        
    }
}