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
      int i=0;
 void change(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null)
        return ;
        change(root.left,arr);
        root.val=arr.get(i);
        i++;
        change(root.right,arr);
        return;

    }
    void inorder(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null)
            return ;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        return;
    }
    public TreeNode bstToGst(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        for(int i=arr.size()-2;i>=0;i--)
        {
            arr.set(i,arr.get(i)+arr.get(i+1));
        }
        change(root,arr);
        return root;

    }
}