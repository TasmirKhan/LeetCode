/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int maxSum = Integer.MIN_VALUE;

    // Optimal DFS Approach 
    public static int dfs(TreeNode root){
        if(root == null) return 0;
        int left = Math.max(0, dfs(root.left)); // using max to avoid -ve values.
        int right = Math.max(0,dfs(root.right));

        maxSum = Math.max(maxSum, left+right+root.val);
        return root.val + Math.max(left, right);
    }
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE; //Reseting the Static values.
        dfs(root);
        // maxGain(root); Brute Approach Call (ignore it):
        return maxSum;
    }



    // Brute Force Approach.
    // static void maxGain(TreeNode root){
    //     if(root == null) return ;
    //     int left = tillSum(root.left);
    //     int right = tillSum(root.right);
    //     maxSum = Math.max(maxSum, left+right+root.val);
    //     maxGain(root.left);
    //     maxGain(root.right);
    // }

    // static int tillSum(TreeNode root){
    //     if(root == null) return 0;
    //     int left = tillSum(root.left);
    //     int right = tillSum(root.right);
    //     return Math.max(0, root.val + Math.max(left,right));
    //}
}