class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        int size=0;
        int top=q1.peek();
        while(!q1.isEmpty()){
             top=q1.remove();
            q2.add(top);
            size++;
        }
        while(!q2.isEmpty()&&size>1){
            q1.add(q2.remove());
            size--;
        }
        q2.remove();
        return top;
    }
    
    public int top() {
        int top=q1.peek();
         while(!q1.isEmpty()){
             top=q1.remove();
            q2.add(top);
            
        }
        while(!q2.isEmpty()){
            q1.add(q2.remove());
            
        }
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}