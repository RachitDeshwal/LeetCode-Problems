class Solution {
  public ListNode reverseBetween(ListNode head, int left, int right) {
     
      ListNode dummy=new ListNode (0);
      dummy.next=head;
      ListNode leftpre=dummy;
      ListNode currNode=head;
      for(int i=0;i<left-1;i++){
          leftpre=leftpre.next;
          currNode=currNode.next;
      }
      ListNode subHead=currNode;
      ListNode prev=null;
      ListNode next;
      for(int i=0;i<right-left+1;i++){
          next=currNode.next;
          currNode.next=prev;
          prev=currNode;
          currNode=next;
      }
      leftpre.next=prev;
      subHead.next=currNode;
      return dummy.next;
      

      
  }
}