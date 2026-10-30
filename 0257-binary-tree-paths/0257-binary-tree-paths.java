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
    public void helper(TreeNode root, List<String> lst, StringBuilder sb){
        if(root == null ) return ;
        
        int len = sb.length();
        if(len > 0) sb.append("->");

        sb.append(root.val);
        if(root.left == null && root.right == null){
            lst.add(sb.toString());
        }

        helper(root.left, lst, sb);
        helper(root.right, lst, sb);

        sb.setLength(len);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> lst = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(root, lst, sb);
        return lst;
    }
}