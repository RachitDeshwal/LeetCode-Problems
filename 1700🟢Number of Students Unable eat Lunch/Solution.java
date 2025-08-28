class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count[]=new int[2];
        for(int i=0;i<students.length;i++){
            count[students[i]]++;
        }
        int remaining=sandwiches.length;
        for(int sandwiche:sandwiches){
            if(count[sandwiche]==0){
                break;
            }
            if(remaining--==0){
                break;
            }
            count[sandwiche]--;
        }
        return remaining;

        
    }
}