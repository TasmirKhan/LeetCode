/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    public static TreeNode helper(TreeNode root, TreeNode p , TreeNode q){
        if(p.val > root.val && q.val > root.val){ return helper(root.right, p , q);}
        else if(p.val < root.val && q.val < root.val){ return helper(root.left, p , q); }
        return root;
        

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node= helper(root, p , q);
        return node;
    }
}