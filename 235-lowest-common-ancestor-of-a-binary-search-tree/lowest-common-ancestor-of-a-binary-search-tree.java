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
    boolean path(TreeNode root, TreeNode p,ArrayList<TreeNode> arr)
    {
        if(root==null)
        return false;
        arr.add(root);
        if(root==p)
        return true;
        if(!path(root.left,p,arr)&&!path(root.right,p,arr))
        {
        arr.remove(arr.size()-1);
        return false;
        }
        else 
        return true;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> arr1=new ArrayList<>();
        ArrayList<TreeNode> arr2=new ArrayList<>();
        path(root,p,arr1);
        path(root,q,arr2);
        int i=0;
        while(i<arr1.size()&&i<arr2.size()&&arr1.get(i)==arr2.get(i))
        i++;
        return arr2.get(i-1);
    }
}