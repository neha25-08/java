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
    class info
    {
        boolean status;
        int max;
        int min;
        int sum;
        info(boolean st,int mi,int ma,int su)
        {
             status=st;
            max=ma;
            min=mi;
            sum=su;
        }
    }
    int tmax=0;
    info check(TreeNode root)
    {
        if(root==null)
        return new info(true,Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        info left=check(root.left);
        info right=check(root.right);
        int min = Math.min(root.val, Math.min(left.min, right.min));
        int max = Math.max(root.val, Math.max(left.max, right.max));
        int sum=left.sum+right.sum+root.val;
        if(!right.status||!left.status||left.max>=root.val||right.min<=root.val)
        {
             return new info(false,0,0,0);

        }
        tmax=Math.max(sum,tmax);
        return new info(true,min,max,sum);

    }
    public int maxSumBST(TreeNode root) {
        check(root);
        return tmax; 
    }
}