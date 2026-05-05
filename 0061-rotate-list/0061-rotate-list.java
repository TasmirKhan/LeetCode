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

    static class Pair{
        ListNode tail;
        int count;
        Pair(int c , ListNode t){
            count = c;
            tail = t;
        }
    }
    public static Pair getSize(ListNode head){
        
        int count = 0 ;
        ListNode temp = head, tail = null;
        while(temp != null){
            count++;
            if(temp.next == null){tail = temp;}
            temp = temp.next;
        }
        return new Pair(count, tail);
    }
    public ListNode rotateRight(ListNode head, int k) {
        Pair p  = getSize(head);
        ListNode tail = p.tail;
        int n = p.count;
        if(n!=0){k = k%n;}
        if(k == 0 || head == null || n == 1) return head;     
        
        tail.next = head;
        ListNode temp = head;
        for(int i = 1 ; i<n - k ; i++){
            temp = temp.next;
        }

        ListNode head2 = temp.next;
        temp.next = null;
        
        return head2;



    }
}