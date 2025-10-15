class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        boolean freq[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(Character.toLowerCase(arr[i])=='a'||Character.toLowerCase(arr[i])=='e'||Character.toLowerCase(arr[i])=='i'||Character.toLowerCase(arr[i])=='o'||Character.toLowerCase(arr[i])=='u'){
                freq[i]=true;
            }
        }
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(freq[left]&&freq[right]){
                char ch=arr[left];
                arr[left]=arr[right];
                arr[right]=ch;
                left++;
                right--;
                continue;
            }
            if(!freq[left]){
                left++;
            }
            if(!freq[right]){
                right--;
            }


            if(!freq[left]){
                
            }
        }
        return String.valueOf(arr);
    }
}