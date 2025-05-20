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
    TreeNode check(ArrayList<Integer> ar,int min,int max)
    {
        if(min>max)
        return null;
        int mid=(min+max)/2;
        TreeNode tr=new TreeNode(ar.get(mid));
        tr.left=check(ar,min,mid-1);
        tr.right=check(ar,mid+1,max);
        return tr;
    }
    void inorder(TreeNode root,ArrayList<Integer> ar)
    {
        if(root==null)
        return;
        inorder(root.left,ar);
        ar.add(root.val);
        inorder(root.right,ar);
    }
    public TreeNode balanceBST(TreeNode root) {
       ArrayList<Integer> ar=new ArrayList<>();
       inorder(root,ar);
       return check(ar,0,ar.size()-1); 
    }
}