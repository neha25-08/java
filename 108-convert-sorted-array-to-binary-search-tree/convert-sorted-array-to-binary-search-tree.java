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
    TreeNode check (int[] nums,int left,int right)
    {
        
        if(left>right)
        {
            return null;
        }
        int mid=(left+right)/2;
        TreeNode tr=new TreeNode(nums[mid]);
        
      
        {
        tr.left=check(nums,left,mid-1);
        tr.right=check(nums,mid+1,right);
        }
        return tr;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return check(nums,0,nums.length-1);
    }
}