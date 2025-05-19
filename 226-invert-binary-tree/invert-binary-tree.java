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
    void copy(TreeNode newroot,TreeNode root)
    {
       
        newroot.val=root.val;
        copy(newroot.right,root.left);
        copy(newroot.left,root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        return null;
        TreeNode leff=invertTree(root.right);
        TreeNode righh=invertTree(root.left);
        root.left=leff;
        root.right=righh;
        return root;
    }
}