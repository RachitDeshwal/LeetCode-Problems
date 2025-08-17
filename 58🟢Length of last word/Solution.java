class Solution {
    public int lengthOfLastWord(String s) {
        String[] s1=s.trim().split(" ");
        String word=s1[s1.length-1];
        return word.length();
        
    }
}