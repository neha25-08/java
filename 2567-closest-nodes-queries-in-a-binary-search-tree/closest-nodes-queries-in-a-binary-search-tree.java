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
    ArrayList<Integer> ar=new ArrayList<>();
    void inorder(TreeNode root)
    {
        if(root==null)
        return;
        inorder(root.left);
        ar.add(root.val);
        inorder(root.right);
    }
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        inorder(root);
        ArrayList<List<Integer>> ans=new ArrayList<List<Integer>>();
        int i=0;
        int mid=0;

        while(i<queries.size())
        {
            int x=queries.get(i);
            /*int j=0;
            while(j<ar.size()&&ar.get(j)<=x)
            {
                j++;
            }*/
            int l=0;
            int r=ar.size()-1;
            while(l<=r)
            {
                 mid=(l+r)/2;
                if(ar.get(mid)==x)
                {
                    break;
                }
                else if(ar.get(mid)>x)
                    r=mid-1;
                else
                    l=mid+1;
            }
            ArrayList<Integer> res=new ArrayList<>();
            if(ar.get(mid)==x)
            {
                res.add(x);
                res.add(x);
            }
            else
            {
                if(l==0)
                res.add(-1);
                else
                res.add(ar.get(l-1));

                if(l==ar.size())
                res.add(-1);
                else
                res.add(ar.get(l));
            }
            ans.add(res);
            i++;
        }
        return ans;
    }
}