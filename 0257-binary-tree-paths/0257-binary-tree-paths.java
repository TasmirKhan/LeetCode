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
    public void helper(TreeNode root, List<String> lst, String sb){
        if(root.left == null && root.right == null) {lst.add(sb + root.val); return ; }
        
        if(root.left != null ) helper(root.left, lst, sb +(root.val)+("->"));
        if(root.right != null) helper(root.right, lst, sb+(root.val) +("->"));
    
        // if(root.left != null ) helper(root.left, lst, sb.append(root.val).append("->"));
        // if(root.right != null) helper(root.right, lst, sb.append(root.val).append("->"));
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> lst = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(root, lst, "");
        return lst;
    }
}