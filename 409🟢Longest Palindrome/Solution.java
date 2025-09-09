class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        if(n==1){
            return 1;
        }
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int res=0;
        boolean odd=false;
        for(int num:map.values()){
            if(num%2==0){
                res+=num;
            }
            else{
                res+=num-1;
                odd=true;
            }
        }
        
      return  (odd) ? ++res: res;
        
    }
}