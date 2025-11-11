class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        int carry=0;
        
        List<Integer> res=new ArrayList<>();
        for(int i=num.length-1;i>=0;i--){
            int r=0;
            int sum=0;
            if(k>0){
                r=k%10;
                k=k/10;
            }
            sum=carry+r+num[i];
            if(sum>9){
                carry=1;
                sum=sum%10;
            }
            else{
                carry=0;
            }
            res.add(sum);
            


            
        }
        while(k>0){
            int sum=0;
        sum=k%10+carry;
        k=k/10;
         if(sum>9){
                carry=1;
                sum=sum%10;
            }
            else{
                carry=0;
            }
            res.add(sum);
            
        }
        if(carry>0){
            res.add(1);
        }
        Collections.reverse(res);
        return res;

        
        
        
    }
}