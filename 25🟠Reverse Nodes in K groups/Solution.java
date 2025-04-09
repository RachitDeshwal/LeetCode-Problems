class Solution {
  public ListNode reverseKGroup(ListNode head, int k) {
      int n=len(head);
      int groups=n/k;
      ListNode ansNode=new ListNode();
      ListNode prevHead=null;
      ListNode currHead=head;
      for(int i=0;i<groups;i++){
          ListNode curr=currHead;
          ListNode prev=null;
          ListNode next;
          for(int j=0;j<k;j++){
              next=curr.next;
              curr.next=prev;
              prev=curr;
              curr=next;
          }
          if(prevHead==null){
              ansNode=prev;
          }
          else{
              prevHead.next=prev;
          }
          prevHead=currHead;
          currHead=curr;

      }
      prevHead.next=currHead;
      return ansNode;

      
  }
  public int len(ListNode head){
      int counter=0;
      while(head!=null){
          head=head.next;
          counter++;
      }
      return counter;
  }
}