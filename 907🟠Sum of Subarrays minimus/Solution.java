class Solution {
    public int sumSubarrayMins(int[] arr) {
        long sum=0;
        int MOD=1000000007;
       Stack<Integer> s1=new Stack<>();
       Stack<Integer> s2=new Stack<>();
       int left[]=new int[arr.length];
       int right[]=new int[arr.length];
       for(int i=0;i<arr.length;i++){
        while(!s1.isEmpty()&&arr[i]<=arr[s1.peek()]){
            s1.pop();
        }
        if(s1.isEmpty()){
            s1.push(i);
            left[i]=i+1;
        }
        else{
            
            left[i]=i-s1.peek();
            s1.push(i);
        }


       }
       for(int i=arr.length-1;i>=0;i--){
        while(!s2.isEmpty()&&arr[i]<arr[s2.peek()]){
            s2.pop();
        }
        if(s2.isEmpty()){
            s2.push(i);
            right[i]=arr.length-i;
        }
        else{
            
            right[i]=s2.peek()-i;
            s2.push(i);
        }
       }
       for(int i=0;i<arr.length;i++){
        sum=(sum+(long)arr[i]*left[i]*right[i])%MOD;
       }
       return (int)sum;
       
        
    }
}