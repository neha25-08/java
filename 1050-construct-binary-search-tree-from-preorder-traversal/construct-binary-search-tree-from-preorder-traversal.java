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
    int count=0;
    TreeNode create(TreeNode root,int value)
    {
        if(root==null)
        {
            root=new TreeNode(value);
            return root;
        }
        else if(root.val<value)
        {
            root.right=create(root.right,value);
        }
        else
        {
             root.left=create(root.left,value);
        }
    return  root;
        
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int i=0;i<preorder.length;i++)
        root=create(root,preorder[i]);
        return root;
    }
}