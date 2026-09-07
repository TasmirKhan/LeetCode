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
        if(root == null) return lst;
        Queue<TreeNode> temp = new ArrayDeque<>();
        temp.offer(root);
        while(!temp.isEmpty()){
            int n = temp.size();
            ArrayList<Integer> tempLst = new ArrayList<>();
           for(int i = 0 ; i<n; i++){
            TreeNode x = temp.poll();
            if(x.left != null) temp.offer(x.left);
            if(x.right != null) temp.offer(x.right);
            tempLst.add(x.val);
           }
           lst.add(tempLst);
        }
        return lst;
    }
}