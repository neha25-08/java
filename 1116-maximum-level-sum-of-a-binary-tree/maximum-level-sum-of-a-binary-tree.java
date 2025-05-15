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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int lev=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        int cur=1;
        while(!q.isEmpty())
        {
            TreeNode x=q.remove();
            if(x==null)
            {
                if(sum>max)
                {
                    max=sum;
                    lev=cur;
                }
                sum=0;
                cur++;
                if(q.isEmpty())
                break;
                else
                q.add(null);
            }
            else
            {
            sum+=x.val;
            if(x.left!=null)
            q.add(x.left);
            if(x.right!=null)
            q.add(x.right);
            }
        }
        return lev;
    }
}