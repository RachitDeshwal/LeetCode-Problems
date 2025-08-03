class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1||nums.length==0){
            return nums.length;
        }
        HashMap<Integer,Boolean> map=new HashMap<>();
        int largestLength=Integer.MIN_VALUE;
        for(int num:nums){
            map.put(num,false);
        }
        for(int num:nums){
            int currentLength=1;
            int next=num+1;
            while(map.containsKey(next)&&map.get(next)==false){
                currentLength++;
                map.put(next,true);
                next+=1;
            }
            int prev=num-1;
            while(map.containsKey(prev)&&map.get(prev)==false){
                currentLength++;
                map.put(prev,true);
                prev-=1;
            }
            largestLength=Math.max(largestLength,currentLength);
        }
        return largestLength;
        
    }
}