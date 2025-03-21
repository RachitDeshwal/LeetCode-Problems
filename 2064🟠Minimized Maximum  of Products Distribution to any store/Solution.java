class Solution {
  public int minimizedMaximum(int n, int[] quantities) {
      int start=1;
      int end=Integer.MIN_VALUE;
      for(int i=0;i<quantities.length;i++){
          if(quantities[i]>end){
              end=quantities[i];
          }
      }
      int res=-1;
      while(start<=end){
          int mid=start+(end-start)/2;
          if(isDistributionPossible(quantities,mid,n)){
               res=mid;
               end=mid-1;

          }
          else{
              start=mid+1;
          }
      }
      return res;
      
      
  }
  public boolean isDistributionPossible(int quantities[],int maxproducts,int stores){
      int storecount=0;
      for(int i=0;i<quantities.length;i++){
          storecount+=quantities[i]/maxproducts;
          if((quantities[i]%maxproducts)!=0){
              storecount++;
          }
      }
      if(storecount>stores){
          return false;
      }
      return true;
  }
}