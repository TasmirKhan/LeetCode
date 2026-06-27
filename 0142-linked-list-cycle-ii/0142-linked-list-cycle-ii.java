/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode t = head;
        ListNode h = head;

        while(h != null && h.next != null){
            t = t.next;
            h = h.next.next;

            if(t==h){
            t = head;
            while(t!=h){
                t = t.next;
                h = h.next;
            }
            return t;
        }

        }

        
        return null;
    }
}