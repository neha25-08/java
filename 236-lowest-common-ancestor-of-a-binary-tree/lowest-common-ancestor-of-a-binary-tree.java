/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
        return null;
        if(root==p||root==q)
        return root;
        TreeNode r1=lowestCommonAncestor(root.left, p, q);
        TreeNode r2=lowestCommonAncestor(root.right, p, q);
        if(r1==null)
        return r2;
        if(r2==null)
        return r1;
        //if(r1!=null&&r2!=null)
        return root;
    }
}