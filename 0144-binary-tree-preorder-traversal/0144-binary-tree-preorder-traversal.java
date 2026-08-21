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
    // public static void helper(TreeNode root, List<Integer> lst){
    //     if(root == null) return ;
    //     lst.add(root.val);
    //     helper(root.left,lst);
    //     helper(root.right,lst);
    // }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        if(root == null) return lst;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode temp = st.pop();
            lst.add(temp.val);
            if(temp.right != null){st.push(temp.right);}

            if(temp.left != null){st.push(temp.left);}
            
        }
        return lst;
    }
}