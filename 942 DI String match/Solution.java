class Solution {
    public int[] diStringMatch(String s) {
        int d=s.length();
        int i=0;
        int res[]=new int[d+1];
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='I'){
                res[j]=i;
                i++;
            }
            else {
                res[j]=d;
                d--;
            }
        }
        res[s.length()]=i;
        return res;
        
    }
}