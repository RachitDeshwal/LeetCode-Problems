class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head!=null&&head.next==null){
            return head;
        }
        ListNode prev=new ListNode(-1);
        ListNode temp=prev;
        while(head!=null&&head.next!=null){
            prev.next=head.next;
            head.next=head.next.next;
            prev.next.next=head;
            prev=head;
            head=head.next;
        }
        return temp.next;
    }
}