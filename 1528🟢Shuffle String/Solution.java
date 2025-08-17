class Solution {
    public String restoreString(String s, int[] indices) {
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[indices[i]]=s.charAt(i);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}