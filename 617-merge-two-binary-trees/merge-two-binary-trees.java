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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null)
        return null;
        if(root1==null)
        {
            TreeNode tr=new TreeNode(root2.val);
            tr.left=mergeTrees(null,root2.left);
            tr.right=mergeTrees(null,root2.right);
            return tr;
        }
        if(root2==null)
        {
            TreeNode tr=new TreeNode(root1.val);
            tr.left=mergeTrees(root1.left,null);
            tr.right=mergeTrees(root1.right,null);
            return tr;
        }
        TreeNode tr=new TreeNode(root1.val+root2.val);
        tr.left=mergeTrees(root1.left,root2.left);
        tr.right=mergeTrees(root1.right,root2.right);
        return tr;
    }
}