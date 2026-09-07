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
     public static void helper(TreeNode root, ArrayList<Integer> lst){
        if(root == null) return;
        helper(root.left,lst);
        helper(root.right,lst);
        lst.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> lst = new ArrayList<>();
        helper(root,lst);
        return lst;
    }
}