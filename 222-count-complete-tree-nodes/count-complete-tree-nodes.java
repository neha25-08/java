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
    ArrayList<Integer> arr=new ArrayList<>();
    void inorder(TreeNode root)
    {
        if(root==null)
        return ;
        arr.add(root.val);
        inorder(root.left);
        inorder(root.right);

    }
    public int countNodes(TreeNode root) {
        inorder(root);
        return arr.size();
    }
}