/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // while(headB!=null){
        //     ListNode temp = headA;
        //     while(temp != null){
        //         if(temp == headB) return headB;
        //         temp = temp.next;
        //     }
        //     headB = headB.next;
        // }


        // HashSet<ListNode> set = new HashSet<>();
        // while(headA != null){
        //     set.add(headA);
        //     headA = headA.next;
        // }

        // while(headB != null){
        //     if(set.contains(headB)){ return headB;}
        //     headB = headB.next;
        // }
        // return null;

        // ListNode temp = headA;
        // ListNode temp2 = headB;
        // int count =0, count2 = 0;
        // while(temp != null){
        //     count++;
        //     temp = temp.next;
        // }
        // while(temp2 != null){
        //     count2++;
        //     temp2 = temp2.next;
        // }

        // if(count2>count){
        //     int x = count2 - count;
        //     while(x>0){
        //         headB = headB.next;
        //         x--;
        //     }
        // }
        // if(count2<count){
        //     int x = count - count2;
        //     while(x>0){
        //         headA = headA.next;
        //         x--;
        //     }
        // }
        // while(headA != null){
        //     if(headA == headB) return headA;
        //     headA = headA.next;
        //     headB = headB.next;
        // }

        // return null;

        ListNode d1 = headA;
    ListNode d2 = headB;
    
    while(d1 != d2) {
        d1 = d1 == null? headB:d1.next;
        d2 = d2 == null? headA:d2.next;
    }
    
    return d1;
    }
}