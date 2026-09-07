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
        lst.add(root.val);
        helper(root.right,lst);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> lst = new ArrayList<>();
       Stack<TreeNode> st = new Stack<>();
       TreeNode curr = root;
        while(curr != null || !st.isEmpty() ){

           while(curr != null){
            st.push(curr);
            curr = curr.left;
           }

           TreeNode top = st.pop();
           lst.add(top.val);

           curr = top.right;
        }
       return lst;
    }
}