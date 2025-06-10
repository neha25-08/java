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
    int sum=0;
    void sum1(TreeNode root)
    {
        if(root==null)
        return;
         if(root.left!=null&&root.left.left==null&&root.left.right==null)
        {
            sum+=root.left.val;
         //   return;
        }
        sum1(root.left);
        sum1(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
       sum1(root);
        return sum;
    }
}