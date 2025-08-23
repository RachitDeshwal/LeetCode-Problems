class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String token:tokens){
            
             if(token.equals("+")){
                int num1=s.pop();
                int num2=s.pop();
                s.push(num1+num2);
            }
            else if(token.equals("-")){
                int num1=s.pop();
                int num2=s.pop();
                s.push(num2-num1);
            }
            else if(token.equals("/")){
                int num1=s.pop();
                int num2=s.pop();
                s.push(num2/num1);
            }
            else if(token.equals("*")){
                int num1=s.pop();
                int num2=s.pop();

                s.push(num1*num2);
            }
            else{
                 int num1=Integer.parseInt(token);
                s.push(num1);
            }

        }
        return s.pop();
        
    }
}