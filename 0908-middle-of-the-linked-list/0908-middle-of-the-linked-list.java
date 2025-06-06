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
    public ListNode middleNode(ListNode head) {
        List<ListNode> list=new ArrayList<>();
        ListNode t=head;
        while(t!=null){
            list.add(t);
            t=t.next;
        }
        int half=(int)list.size() /2;
        return list.get(half);
    }
}