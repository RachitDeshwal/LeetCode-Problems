class Solution {
    public int brokenCalc(int startValue, int target) {
        int numOp=0;
        while(startValue!=target){
            if(startValue*2==target){
                numOp++;
                startValue*=2;
            }
            else if(startValue*2==target+1){
                startValue*=2;
                numOp++;
            }
            else if(startValue*2<target){
                startValue*=2;
                numOp++;
            }
            else{
                startValue--;
                numOp++;
            }
        }
        return numOp;
    }
}