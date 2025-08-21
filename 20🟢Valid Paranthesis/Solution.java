class Solution {
    Stack<Character> s1=new Stack<>();
    public boolean isValid(String s) {
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                s1.push(ch);
            }
            else if(ch==')'){
                if(!s1.isEmpty()&&s1.pop()=='('){
                    continue;
                }
                return false;
            }
            else if(ch=='}'){
                if(!s1.isEmpty()&&s1.pop()=='{'){
                    continue;
                }
                return false;
            }
            else{
                if(!s1.isEmpty()&&s1.pop()=='['){
                    continue;
                }
                return false;
            }
        }
        
        return s1.isEmpty();
        
    }
}