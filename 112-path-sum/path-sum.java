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
    boolean test(TreeNode root, int tar,int sum)
    {
        if(root==null) 
            return false;
        if(root.left==null&&root.right==null)
        {
            if(root.val+sum==tar)
                return true;
            else
                return false;
        }
        return (test(root.left,tar,sum+root.val)|| test(root.right,tar,
        sum+root.val));
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        return false;
        return test(root,targetSum,0);
    }
}