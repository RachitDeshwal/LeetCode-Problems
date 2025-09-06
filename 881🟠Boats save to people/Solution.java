class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats=0;
        int right=people.length-1;
        int left=0;
        while(right>=left){
            if(people[right]==limit){
                boats++;
                right--;

            }
            else{
                if(people[right]+people[left]<=limit){
                    boats++;
                    right--;
                    left++;
                }
                else{
                    right--;
                    boats++;
                }

            }
        }
        return boats;
}
}