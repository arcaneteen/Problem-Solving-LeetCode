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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt=0;
        ListNode t=head;
        while(t!=null){
            cnt++;
            t=t.next;
        }
        if(n==cnt) return head.next;
        t=head;
        for(int i=1;i<cnt-n;i++){
            t=t.next;
        }
        if(t.next!=null)  t.next=t.next.next;
        return head;
    }
}