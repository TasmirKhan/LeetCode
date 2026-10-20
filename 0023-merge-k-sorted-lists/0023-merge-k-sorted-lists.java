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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        int n = lists.length;
        while(i < n){
            ListNode x = lists[i];
            while(x!=null){
            pq.add(x.val);
            x = x.next;
            }
            i++;            
        }

        ListNode res;
        
        if(!pq.isEmpty()){ res = new ListNode(pq.poll());}
        else{ return null; }
        ListNode head = res;
        ListNode tempListNode ;
        while(!pq.isEmpty()){
            tempListNode = new ListNode() ;
            tempListNode.val = pq.poll();
            tempListNode.next = null;
            res.next = tempListNode;
            res = tempListNode;            
        }
        return head;
    }
}