class Solution {
  public ListNode middleNode(ListNode head) {
      ListNode temp=head;
      int size=0;
      while(temp!=null){
          temp=temp.next;
          size++;
      }
      size/=2;
      while(size>0){
          head=head.next;
          size--;
      }
      return head;
      
  }
}