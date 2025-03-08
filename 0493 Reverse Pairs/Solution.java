class Solution {
    public int reversePairs(int[] nums) {
        if(nums==null||nums.length==1){
            return 0;

        }
        return mergeSort(nums,0,nums.length-1);
        
    }
    public int mergeSort(int nums[],int left,int right){
        if(left>=right){
            return 0;
        }
        int mid=left+(right-left)/2;
        int count=mergeSort(nums,left,mid)+mergeSort(nums,mid+1,right);
        count+=countPairs(nums,left,mid,right);
        merge(nums,left,mid,right);
        return count;
    }
    public int countPairs(int nums[],int left,int mid,int right){
        int j=mid+1;
        int count=0;
        for(int i=left;i<=mid;i++){
            while(j<=right&&(long)nums[i]>nums[j]*2L){
                j++;
            }
            count+=j-mid-1;

        }
        return count;


    }
    public void merge(int nums[],int left,int mid,int right){
         int[] temp = new int[right-left+1]; // 👈 Temporary array to store merged values.

              int i = left;   // 👈 Pointer for left subarray
              int j = mid + 1; // 👈 Pointer for right subarray
              int k = 0;      // 👈 Index for temporary array

            while(i<=mid && j<=right){ // 👈 Merge two sorted subarrays.

                if(nums[i]<=nums[j]){
                    temp[k++]=nums[i++];
                }else{
                    temp[k++]=nums[j++];
                }
            }
            while(i<=mid){ // 👈 Copy any remaining elements from the left subarray.

                temp[k++]=nums[i++];
            }
            while(j<=right){ // 👈 Copy any remaining elements from the right subarray.

                temp[k++]=nums[j++];
            }
             System.arraycopy(temp,0,nums,left,temp.length); // 👈 Copy merged elements back to the original array.

    }
}