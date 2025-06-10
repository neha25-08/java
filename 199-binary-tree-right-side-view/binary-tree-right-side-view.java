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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ar=new ArrayList<>();
        if(root==null)
        return ar;
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        q.add(null);
        int y=0;
        while(!q.isEmpty())
        {
            TreeNode x=q.remove();
            if(x==null)
            {
                ar.add(y);
                if(q.isEmpty())
                break;
                else
                q.add(null);
            }
            else
            {
                y=x.val;
                if(x.left!=null)
                q.add(x.left);
                if(x.right!=null)
                q.add(x.right);
            }
        }
        return ar;
    }
}