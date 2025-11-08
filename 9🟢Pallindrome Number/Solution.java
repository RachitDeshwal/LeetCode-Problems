class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int sum=0;
        while(y>0){
            int r=y%10;
            sum=sum*10+r;
            y/=10;
            
        }
        if(sum==x){
            return true;
        }
        return false;
    }
}