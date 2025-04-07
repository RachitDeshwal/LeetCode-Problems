class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummy=new ListNode();
      ListNode head=new ListNode();
      dummy=head;
      int carry=0;
      int sum=0;
      
      while(l1!=null||l2!=null||carry>0){
          int digit1 =(l1!=null)?l1.val:0;
          int digit2 =(l2!=null)?l2.val:0;
           sum=digit1+digit2+carry;
          int digit=sum%10;
          carry=sum/10;
          head.next=new ListNode(digit);
          head=head.next;
          l1=(l1!=null)?l1.next:null;
          l2=(l2!=null)?l2.next:null;
          

          

      }
      return dummy.next;
  }
}