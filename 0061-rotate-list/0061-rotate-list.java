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

    public static int getSize(ListNode head){
        if(head == null) return 0; 
        int count = 0 ;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        int n = getSize(head);
        if(k == 0 || head == null || n == 1) return head;
        
        k = k%n;
        if(k == 0 ) return head;

        ListNode temp = head;
        for(int i = 1 ; i<n - k ; i++){
            temp = temp.next;
        }
        ListNode head2 = temp.next;
        ListNode newStart = temp.next;
        temp.next = null;
        while(newStart != null){
            if(newStart.next == null){newStart.next = head; break;}
            newStart = newStart.next;
        }
        
        return head2;



    }
}