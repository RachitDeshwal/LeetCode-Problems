class RecentCounter {
    int counter;
    Queue<Integer> q1=new LinkedList<>();

    public RecentCounter() {
        counter=0;
    }
    
    public int ping(int t) {
        if(q1.isEmpty()){
            q1.add(t);
            counter++;
            return counter;
        }
        else if((t-3000)<=q1.peek()){
            q1.add(t);
            counter++;
            return counter;
        }
        else{
            while((!q1.isEmpty())&&(t-3000)>q1.peek()){
                q1.remove();
                counter--;
            }
            q1.add(t);
            counter++;
            return counter;
        }

    }
}