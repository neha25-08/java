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
        boolean check(TreeNode root,int x)
        {
            if(root==null)
            return true;
            if(root.val!=x)
            return false;

            return(check(root.left,x)&& check(root.right,x));
        }
        

    public boolean isUnivalTree(TreeNode root) {
        if(root==null)
        return true;
        int x=root.val;
        return check(root,x);
    }
}