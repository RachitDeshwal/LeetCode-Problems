class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int i=0;
        int count=1;
        while(i<nums.length){
            int strIdx=i;
            while(i<nums.length-1&&nums[i]+1==(nums[i+1])){
                i++;
                count++;
            }
            if(count==1){
                list.add(String.valueOf(nums[i]));
            }
            else{
                list.add(String.valueOf(nums[strIdx])+"->"+String.valueOf(nums[i]));
                count=1;
            }
            i++;
        }
        return list;
        
    }
}