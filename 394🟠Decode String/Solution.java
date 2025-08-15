class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> str=new Stack();
        Stack<Integer> num=new Stack();
        StringBuilder sb=new StringBuilder();
        int n=0;
       for(char ch:s.toCharArray()){
        if(Character.isDigit(ch)){
            n=n*10+(ch-'0');

        }
        else if(ch=='['){
            
            num.push(n);
            n=0;
            str.push(sb);
            sb=new StringBuilder();
        }
        else if(ch==']'){
            int k=num.pop();
            StringBuilder temp=sb;
            sb=str.pop();
            while(k-->0){
                sb.append(temp);
            }

        }
        else{
            sb.append(ch);
        }
       }
       return sb.toString();
        
    }
}