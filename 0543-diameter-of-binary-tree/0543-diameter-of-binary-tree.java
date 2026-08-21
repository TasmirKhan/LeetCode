
class Solution {
    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
    }

    public int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        ans = Math.max(ans, left+right);
        return 1 + Math.max(left,right);
    }

    
}


// class Solution {

//     public static int height(TreeNode root){
//         if(root == null) return 0;

//         return 1+ Math.max(height(root.left), height(root.right));
//     }

//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root == null) return 0;
//         int lenl =  diameterOfBinaryTree(root.left);
//         int lenr =  diameterOfBinaryTree(root.right);
//         int currlen = height(root.left) + height(root.right);
//         return Math.max(currlen, Math.max(lenl, lenr));
//     }
// }