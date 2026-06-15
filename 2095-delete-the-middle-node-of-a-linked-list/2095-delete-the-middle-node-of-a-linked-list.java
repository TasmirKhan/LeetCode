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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){head = null; return head;}
        ListNode t = head;
        ListNode h = head;
        ListNode prev = t;
        while(h != null && h.next != null){
            prev = t;
            t = t.next;
            h = h.next.next;
        } 

        prev.next = t.next;
        t.next = null;
        return head;

    }
}