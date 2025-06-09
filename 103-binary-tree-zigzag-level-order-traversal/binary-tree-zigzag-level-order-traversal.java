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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return res;
        q.add(root);
        q.add(null);
        int count =1;
        while(!q.isEmpty())
        {
            TreeNode x=q.remove();
            if(x==null)
            {
                if(count%2==0)
                {
                    Collections.reverse(arr);
                    res.add(new ArrayList<>(arr));
                }
                else
                res.add(new ArrayList<>(arr));
                count++;
                arr.clear();
                if(q.isEmpty())
                break;
                else
                {
                q.add(null);
                }
            }
            else
            {
                arr.add(x.val);
                if(x.left!=null)
                q.add(x.left);
                if(x.right!=null)
                q.add(x.right);
            }
        }
        return res;
    }
}