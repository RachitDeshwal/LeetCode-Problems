class Solution {
  public int[] sortArray(int[] nums) {
       mergeSort(nums,0,nums.length-1);
       return nums;
      
  }
  public void mergeSort(int []nums,int si,int ei){
      if(si>=ei){
          return;
      }
      int mid=si+(ei-si)/2;
      mergeSort(nums,si,mid);
      mergeSort(nums,mid+1,ei);
      merge(nums,si,ei,mid);

  }
  public void merge(int[] nums,int si,int ei,int mid){
      int i=si;
      int j=mid+1;
      int k=0;
      int temp[]=new int[ei-si+1];
      while(i<=mid&&j<=ei){
          if(nums[i]>=nums[j]){
              temp[k]=nums[j];
              j++;
              k++;
          }
          else{
              temp[k]=nums[i];
              i++;
              k++;
          }
      }
      while(i<=mid){
          temp[k++]=nums[i++];
      }
      while(j<=ei){
          temp[k++]=nums[j++];
      }
      for(int z=0;z<temp.length;z++){
          nums[si+z]=temp[z];
      }

  }
}