/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public static void helper(TreeNode root, StringBuilder sb){
        if(root == null) return ;
        if(sb.length()> 0)sb.append(",");
        sb.append(root.val); 
        helper(root.left,sb);
        helper(root.right, sb);
    }
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.toString();
    }

    int index = 0;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length() == 0) return null;
        String[] arr = data.split(",");

        index = 0;
        return build(arr, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode build(String[] arr , int min, int max){
        if(index >= arr.length) return null;

        int current = Integer.parseInt(arr[index]);
        

        if(current < min || current > max) return null;
        index++;


        TreeNode root = new TreeNode(current);
        root.left = build(arr,min,current);
        root.right = build(arr,current, max);
        return root;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;