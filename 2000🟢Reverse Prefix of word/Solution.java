class Solution {
    public String reversePrefix(String word, char ch) {
     char str[]=word.toCharArray();
     for(int i=0;i<str.length;i++){
        if(str[i]==ch){
            int left=0;
            int right=i;
            while(left<right){
                char temp=str[left];
                str[left]=str[right];
                str[right]=temp;
                left++;
                right--;
            }
            break;
        }
     }
     return String.valueOf(str);
    }
}