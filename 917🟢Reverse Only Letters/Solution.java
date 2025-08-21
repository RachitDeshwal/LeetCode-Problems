class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[]=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(Character.isUpperCase(arr[left])||Character.isLowerCase(arr[left])){
                if(Character.isUpperCase(arr[right])||Character.isLowerCase(arr[right])){
                    char temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    left++;
                    right--;

                }
                else{
                    right--;
                }
            }
            else{
                left++;
            }

        }
        return String.valueOf(arr);
        
    }
}