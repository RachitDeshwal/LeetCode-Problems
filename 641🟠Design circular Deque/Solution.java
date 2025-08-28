class MyCircularDeque {
    int arr[];
    int size=0;
    int front=0;
    int rear;
    int capacity;

    public MyCircularDeque(int k) {
        arr=new int[k];
        capacity=k;
        rear=k-1;
        
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        front=(front-1+capacity)%capacity;
        arr[front]=value;
        size++;
        return true;

    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        rear=(rear+1)%capacity;
        arr[rear]=value;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        front=(front+1)%capacity;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        rear=(rear-1+capacity)%capacity;
        size--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    
    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return (size==0);
    }
    
    public boolean isFull() {
        return (size==capacity);
    }
}