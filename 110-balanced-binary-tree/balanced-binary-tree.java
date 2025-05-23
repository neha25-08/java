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
    int depth(TreeNode root)
    {
        if(root==null)
        return 0;
        return 1+Math.max(depth(root.left),depth(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        return true;
         int r=depth(root.right);
        int l=depth(root.left);
        if(Math.abs(l-r)>1)
        return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
}