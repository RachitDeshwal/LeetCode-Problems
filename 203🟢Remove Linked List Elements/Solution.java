class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=new ListNode(-1);
        ListNode temp1=temp;
        ListNode curr=head;
        temp.next=head;
        while(curr!=null){
            if(curr.val==val){
                temp.next=curr.next;
                curr=curr.next;
            
            }
            else{
                temp=temp.next;
                curr=curr.next;
            }
            
        }
        return temp1.next;

        
    }
}