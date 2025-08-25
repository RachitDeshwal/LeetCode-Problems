class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s1=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int num1=s1.pop();
                int num2=s1.pop();
                s1.push(num2);
                s1.push(num1);
                s1.push(num2+num1);
            }
            else if(operations[i].equals("D")){
                s1.push(s1.peek()*2);
            }
            else if(operations[i].equals("C")){
                s1.pop();
            }
            else{
                s1.push(Integer.parseInt(operations[i]));
            }

        }
        int sum=0;
        while(!s1.isEmpty()){
            sum+=s1.pop();
        }
        return sum;
    }
}