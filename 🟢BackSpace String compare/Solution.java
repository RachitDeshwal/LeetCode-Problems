class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> t1=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#'){
                if(!s1.isEmpty()){
                    s1.pop();
                }
            }
            else{
                s1.push(ch);
            }
        }
        for(char ch:t.toCharArray()){
            if(ch=='#'){
                if(!t1.isEmpty()){
                    t1.pop();
                }
            }
            else{
                t1.push(ch);

            }
        }
        return (s1.equals(t1));
    }
}