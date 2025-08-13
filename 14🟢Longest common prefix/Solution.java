class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int n=Math.min(first.length(),last.length());
        for(int i=0;i<n;i++){
            if(first.charAt(i)!=last.charAt(i)){
                return last.substring(0,i);
            }
        }
        return  last.substring(0,n);

        
    }
}