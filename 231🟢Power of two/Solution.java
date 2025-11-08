class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0||n<0){
            return false;
        }
        
        int count =0;
        while(n>0){
            if((n|1)==n){
                count++;
                if(count>1){
                    return false;
                }
              n=n>>1;
            }
            else{
                
                n=n>>1;
            }
        }
        return true;

    }
}