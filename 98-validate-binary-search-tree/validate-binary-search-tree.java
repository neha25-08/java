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

    boolean check(TreeNode root,long min,long max)
    {
        if(root==null)
        return true;
        if(root.val>=max||root.val<=min)
        {
            return false;
        }
        return check(root.left,min,root.val)&&check(root.right,root.val,max);
    }
    public boolean isValidBST(TreeNode root) {
        long max=Long.MAX_VALUE;
        long min=Long.MIN_VALUE;
        return check(root,min,max);
    }
}