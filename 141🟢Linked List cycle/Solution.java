public class Solution {
  public boolean hasCycle(ListNode head) {
      ListNode slow=head;
      ListNode fast=head;
      while(fast!=null&&fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
          if(fast==slow){
              return true;
          }
      }
      return false;
      
  }
}class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node curr=head;
        // step 1 create seprate copy of same values that assinged b/w list nodes
        while(curr!=null){
            Node newNode= new Node(curr.val);
            newNode.next=curr.next;
            curr.next=newNode;
            curr=newNode.next;

        }
        //step 2 copy random pointers
        curr=head;
        while(curr!=null){
            if(curr.random!=null){

            
            curr.next.random=curr.random.next;
            
        }
        curr=curr.next.next;
        }
        //step 3 seprate both lists
        curr=head;
        Node newHead=head.next;
        Node newcurr=curr.next;
        while(curr!=null){
            curr.next=newcurr.next;
            curr=curr.next;
            if(curr!=null){
                newcurr.next=curr.next;
                newcurr=newcurr.next;
            }
        }
        return newHead;
        
    }
}