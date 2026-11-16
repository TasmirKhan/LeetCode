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
    private void helper(TreeNode root, StringBuilder sb){
        
        if(sb.length() > 0) sb.append(",");

        if(root == null) {sb.append("#"); return ;}
        sb.append(root.val);
        helper(root.left, sb);
        helper(root.right, sb);
    }
    public String serialize(TreeNode root) {
        StringBuilder sb =new StringBuilder();
        helper(root, sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    int index = 0;
    public TreeNode deserialize(String data) {
        if(data == null || data.isEmpty()) return null;
        String[] arr = data.split(",");
        index = 0;
        return build(arr);
    }

    private TreeNode build(String[] arr){
        if(index >= arr.length ){ return null; }

        String current = arr[index];        
        index++;

        if(current.equals("#")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(current));
        root.left = build(arr);
        root.right = build(arr);

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));