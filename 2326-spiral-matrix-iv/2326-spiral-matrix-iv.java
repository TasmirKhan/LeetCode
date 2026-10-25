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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr = new int[m][n];
        int top = 0, left = 0, bottom = m-1 , right = n-1;

        while(top <= bottom && left <= right){

            for(int col = left ; col <= right ; col++){
                if(head != null){
                    arr[top][col] = head.val;
                    head = head.next;
                }
                else{
                    arr[top][col] = -1;
                }
            }
            top++;

            for(int row = top ; row <= bottom ; row++){
                if(head != null){
                    arr[row][right] = head.val;
                    head = head.next;
                }
                else{
                    arr[row][right] = -1;
                }
            }
            right--;

            if(top <= bottom){
                for(int col = right ; col >= left; col--){
                    if(head != null){
                        arr[bottom][col] = head.val;
                        head = head.next;
                    }
                    else{
                        arr[bottom][col] = -1;
                    }
                }
                bottom--;
            }

            if(left <= right){
                for(int row = bottom ; row >= top ; row--){
                    if(head != null){
                        arr[row][left] = head.val;
                        head = head.next;
                    }
                    else{
                        arr[row][left] = -1;
                    }
                }
                left++;
            }
        }

        return arr;

    }
}