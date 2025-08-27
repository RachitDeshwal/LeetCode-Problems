class Solution {
    public String removeKdigits(String num, int k) {
        if(k == num.length()){
            return "0";
        }
        int j = k;
        Stack<Integer> s1 = new Stack<>();
        
        for(int i=0; i<num.length(); i++){
            int cur = num.charAt(i) - '0';
            while(!s1.isEmpty() && k > 0 && cur < s1.peek()){
                s1.pop();
                k--;
            }
            s1.push(cur);
        }

        // Remove extra digits if needed
        while(s1.size() > num.length() - j){
            s1.pop();
        }

        // Build result string
        StringBuilder sb = new StringBuilder();
        for(int d : s1){
            sb.append(d);
        }

        // Strip leading zeros
        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
