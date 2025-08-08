class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        ListNode temp1=head;
        while(temp!=null){
            size+=1;
            temp=temp.next;
        }
        size-=n;
        if(size==0){
            return head.next;
        }
        int i=1;
        while(i<size){
            temp1=temp1.next;
            i++;
        }
        temp1.next=temp1.next.next;
        return head;
        
    }
}