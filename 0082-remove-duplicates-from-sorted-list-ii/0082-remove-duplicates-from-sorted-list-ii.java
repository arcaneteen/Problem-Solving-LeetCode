/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode dummy=new ListNode(0);//for checking the head too
        dummy.next=head;
        ListNode t=dummy;
        while(t.next!=null && t.next.next!=null){
            if(t.next.val==t.next.next.val){
                int duplicate=t.next.val;
                while(t.next!=null && t.next.val==duplicate){
                    t.next=t.next.next;
                }
             }
            else{
                t=t.next;
            }
        }
        return dummy.next;
    }
}