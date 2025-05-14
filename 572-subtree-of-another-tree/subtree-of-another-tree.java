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
    public boolean isId(TreeNode root, TreeNode subroot)
    {
        if(root==null&&subroot==null)
        return true;
        if(root==null||subroot==null||root.val!=subroot.val)
        return false;
        if(!isId(root.left,subroot.left))
        return false;
        if(!isId(root.right,subroot.right))
        return false;
        return true;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null)
        return false;
        if(root.val==subRoot.val)
        {
            if(isId(root,subRoot))
            return true;
        }
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
}