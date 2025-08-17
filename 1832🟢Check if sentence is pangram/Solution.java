class Solution {
    public boolean checkIfPangram(String sentence) {
        int countFreq[]=new int[26];
        for(int i=0;i<sentence.length();i++){
            countFreq[sentence.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(countFreq[i]==0){
                return false;
            }
        }
        return true;
        
    }
}