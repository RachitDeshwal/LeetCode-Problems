public  class Node {
  int key,value;
  Node next,prev;
  public Node(int key,int value){
      this.key=key;
      this.value=value;
      this.next=null;
      this.prev=null;
  }


  
}


class LRUCache {
    
    private static Node head;
    private static Node tail;
    HashMap<Integer,Node> map=new HashMap<>();
    private static int cap=0;

  

  public LRUCache(int capacity) {
      this.cap=capacity;
      head=new Node(0,0);
      tail=new Node(0,0);
      head.next=tail;
      tail.prev=head;
      
  }
  public void remove(Node temp){
      temp.prev.next=temp.next;
      temp.next.prev=temp.prev;
  }
  public void insertAtFront(Node temp){
      temp.next=head.next;
      temp.next.prev=temp;
      temp.prev=head;
      head.next=temp;
  }

  public int get(int key) {
      if(map.containsKey(key)){
          Node temp=map.get(key);
          int val=temp.value;
          remove(temp);
          insertAtFront(temp);
          return val;
      }
      return -1;

      
  }

  
  public void put(int key, int value) {
      
      if(map.containsKey(key)){
          Node temp=map.get(key);
          temp.value=value;
          map.remove(key);
          
          remove(temp);
          
          map.put(key,temp);
          insertAtFront(temp);

      }
      else{
          Node node=new Node(key,value);
       
          map.put(key,node);
          if(map.size()>cap){
              map.remove(tail.prev.key);
              remove(tail.prev);
               
          insertAtFront(node);
              

          }
          else{
               
          insertAtFront(node);
          }
          
            
      }
     
  }
}