class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0;
        int maxScore=0;
        int n=tokens.length;
        Arrays.sort(tokens);
        int i=0;
        int j=n-1;
        while(i<=j){
           
            if(power>=tokens[i]){
                score++;
                power-=tokens[i];
                
                i++;
                maxScore=Math.max(maxScore,score);
            }
            
               else if(score>0){
                    power+=tokens[j];
                    score--;
                    j--;
                   
                }
                else{
                    return maxScore;
                }


            
            
        }
        return maxScore;
        
    }
}