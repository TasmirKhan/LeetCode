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
        if(root == null ) return ;
        lst.add(root.val);
        helper(root.left,lst);
        helper(root.right, lst);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> lst = new ArrayList<>();
        if(root == null) return lst;
        lst.add(root.val);
        lst.addAll(preorderTraversal(root.left));
        lst.addAll(preorderTraversal(root.right));
        // helper(root,lst);
         return lst;
    }
}