class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> map=new HashMap<>();
        int totalRound=0;
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
       for(int num:map.values()){
        if(num==1){
            return -1;
        }
        else if(num%3==0){
            totalRound+=num/3;
        }
        else{
            totalRound+=num/3+1;
        }
       }
        return totalRound;


    }
    
}