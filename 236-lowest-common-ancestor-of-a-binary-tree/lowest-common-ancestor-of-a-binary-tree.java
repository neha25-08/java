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
    boolean gett(TreeNode root, ArrayList<TreeNode> path,int n)
    {
        if(root==null)
        return false; 
        path.add(root);
        if(root.val==n)
        return true;
        if(gett(root.left,path,n)||gett(root.right,path,n))
        {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> path1=new ArrayList<>();
        gett(root,path1,p.val);
        ArrayList<TreeNode> path2=new ArrayList<>();
        gett(root,path2,q.val);
        int i=0;
        for( i=0;i<path1.size()&&i<path2.size();i++)
        {
            if(path1.get(i)!=path2.get(i))
            break;
        }

        return path1.get(i-1);
    }
}