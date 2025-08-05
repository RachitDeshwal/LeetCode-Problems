public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode temp1=headA;
       ListNode temp2=headB;
       int list1Size=0;
       int list2Size=0;
       while(temp1!=null){
        temp1=temp1.next;
        list1Size++;
       }
       while(temp2!=null){
        temp2=temp2.next;
        list2Size++;
       }
       while(list1Size>list2Size){
        list1Size--;
        headA=headA.next;
       }
       while(list1Size<list2Size){
        list2Size--;
        headB=headB.next;
       }

       while(headA!=headB){
        headA=headA.next;
        headB=headB.next;
       }
       return headA;
    }
}