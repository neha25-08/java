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
    ArrayList<String> ls=new ArrayList<>();
    void join(TreeNode root,String str)
    {
        if(root.left==null&&root.right==null)
        {
            if(str=="")
            str+=root.val;
            else
            {
                str+="->";
                str+=root.val;
            }
            ls.add(str);
            return ;
        }
        if(str=="")
        str+=root.val;
        else
        {
            str+="->";
            str+=root.val;
        }
        if(root.left!=null)
        join(root.left,str);
        if(root.right!=null)
        join(root.right,str);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        
        join(root,"");
        return ls;
    }
}