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
    int sumget(TreeNode root,int sum)
    {
        if(root == null)
        return 0;
        sum=sum*10+root.val;
        if (root.left == null && root.right == null)
            return sum;
        int leftsum=sumget(root.left,sum);
        int rightsum=sumget(root.right,sum);
        return leftsum+rightsum;
    }
    public int sumNumbers(TreeNode root) {
        return sumget(root,0);
    }
}