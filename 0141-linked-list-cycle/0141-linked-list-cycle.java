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
    public boolean hasCycle(ListNode head) {
        if(head == null ) return false;
        ListNode h = head.next;
        ListNode t = head;
        while(t!=h && h != null && h.next != null){
            t = t.next;
            h = h.next.next;
        }
        if(h == null || h.next == null || h.next == null) return false;
        return true;
    }
}