class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1){
            return "";
        }
        char arr[]=palindrome.toCharArray();
        boolean isA=true;
        int i=0;
        int idx=0;
        int j=0;
        while(i<=arr.length-1){
        
            if(arr[i]!='a'&&j>0){
                isA=false;
                
                break;
            }
            if(arr[i]!='a'){
                idx=i;
                j++;
            }
            i++;
        }
         if(isA){
        arr[arr.length-1]='b';
    }
    else{
        arr[idx]='a';
    }
    return String.valueOf(arr);

        
    }
   
}