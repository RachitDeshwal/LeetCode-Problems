class Solution {
    public int countSubstrings(String s) {
        int totalCount=0;
        for(int i=0;i<s.length();i++){
            totalCount+=countPalindrome(s,i,i);
            totalCount+=countPalindrome(s,i,i+1);

        }
        return totalCount;

    }
    public int countPalindrome(String s,int left,int right){
        int count=0;
        while((left>=0&&right<s.length())&&s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}