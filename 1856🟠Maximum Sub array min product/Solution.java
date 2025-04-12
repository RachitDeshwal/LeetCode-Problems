class Solution {
  public int maxSumMinProduct(int[] nums) {
      int n=nums.length;
      long max=Integer.MIN_VALUE;
      long presum[]=new long[n+1];
      for(int i=0;i<n;i++){
          presum[i+1]=presum[i]+nums[i];
      }
      int nextSmallerLeft[]=NSLE(nums);
      int nextSmallerRight[]=NSRE(nums);
      for(int i=0;i<n;i++){
          int min=nums[i];
          int lr=nextSmallerLeft[i];
          int rr=nextSmallerRight[i];
          long sum=presum[rr]-presum[lr+1];
          long minprod=min*sum;
          max=Math.max(minprod,max);


      }
      return (int)(max%1000000007);
      
  }
  public int[] NSLE(int[] nums){
      Stack<Integer> s=new Stack<>();
      int nls[]=new int[nums.length];
      for(int i=0;i<nums.length;i++){
          while(!s.isEmpty()&&nums[i]<=nums[s.peek()]){
              s.pop();
          }
          if(s.isEmpty()){
              nls[i]=-1;
              s.push(i);
              continue;
          }
          nls[i]=s.peek();
          s.push(i);
      }
      return nls;
  }
  public int[] NSRE(int[] nums){
      Stack<Integer> s=new Stack<>();
      int nrs[]=new int[nums.length];
      for(int i=nums.length-1;i>=0;i--){
          while(!s.isEmpty()&&nums[i]<=nums[s.peek()]){
              s.pop();
          }
          if(s.isEmpty()){
              nrs[i]=nums.length;
              s.push(i);
              continue;
          }
          nrs[i]=s.peek();
          s.push(i);
      }
      return nrs;
  }
}