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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root == null) return lst;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> nlst = new ArrayList<>();
            for(int i = 0 ; i < size ; i++){
                TreeNode temp = queue.poll();
                nlst.add(temp.val);
                if(temp.left != null) queue.offer(temp.left);
                if(temp.right != null) queue.offer(temp.right);
            }
            lst.add(nlst);
        }
        return lst;
    }
}