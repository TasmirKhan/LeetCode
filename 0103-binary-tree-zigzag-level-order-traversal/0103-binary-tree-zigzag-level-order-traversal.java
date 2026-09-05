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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
         Queue<TreeNode> q = new ArrayDeque<>();
         if(root == null) return lst;
         q.add(root);
         boolean rev = false;
         while(!q.isEmpty()){
            int size = q.size();
            List<Integer> tempLst = new ArrayList<>();
            for(int i = 0 ; i<size ; i++){
                TreeNode x = q.poll();
                if(x.left != null) q.add(x.left);
                if(x.right!= null) q.add(x.right);
                tempLst.add(x.val);
            }

            if(rev == true) {
                rev = false;
                Collections.reverse(tempLst);
            }
            else{ rev = true; }
            lst.add(tempLst);
         }
         return lst;

    }
}