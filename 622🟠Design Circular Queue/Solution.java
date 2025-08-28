class MyCircularQueue {
    int arr[];
        
        int rear=-1,front=-1;
        int size;

    public MyCircularQueue(int k) {
        arr=new int[k];
        size=k;
    }
    
    
    public boolean enQueue(int value) {
        if((rear+1)%size==front){
            return false;
        }
        if(front==-1&&rear==-1){
            front=rear=0;
            arr[front]=value;
            
            return true;
        }
        rear=(rear+1)%size;
        arr[rear]=value;
        return true;
    }
    
    public boolean deQueue() {
        if(rear==-1&&front==-1){
            return false;
        }
        if(front==rear){
            front=-1;
            rear=-1;
            return true;
        }
        front=(front+1)%size;
        return true;
        
    }
    
    public int Front() {
        if(rear==-1&&front==-1){
            return -1;
        }
        return arr[front];
    }
    
    public int Rear() {
        if(rear==-1&&front==-1){
            return -1;
        }
        return arr[rear];
        
    }
    
    public boolean isEmpty() {
        if(front==-1&&rear==-1){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if((rear+1)%size==front){
            return true;
        }
        return false;
        
    }
}
