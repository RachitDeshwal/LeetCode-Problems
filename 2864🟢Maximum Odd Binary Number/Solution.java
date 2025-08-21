class Solution {
    public String maximumOddBinaryNumber(String s) {
        char arr[]=s.toCharArray();
        int n=arr.length;
        if(arr[n-1]!='1'){
            int i=n-2;
            while(i>=0){
                if((int)arr[i]=='1'){
                    char temp=arr[i];
                    arr[i]=arr[n-1];
                    arr[n-1]=temp;
                    break;
                }
                else{
                    i--;
                }
            }
        }
        int idx=0;
        for(int i=1;i<n-1;i++){
            if(idx<i-1&&arr[idx]=='1'){
                idx++;
            }
            if(arr[i]=='1'&&idx!=i){
                char temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                idx++;
            }

        }
        return String.valueOf(arr);
        
    }
}