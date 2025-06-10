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
        HashMap<Integer,Integer> hm= new HashMap<>(); 
    void freq(TreeNode root)
    {
        if(root==null)
        return ;
        int x=root.val;
        if(hm.containsKey(x))
        {
            hm.put(x,hm.get(x)+1);
        }
        else
        {
             hm.put(x,1);
        }
        freq(root.left);
        freq(root.right);
    }
    public int[] findMode(TreeNode root) {
        freq(root);
        Set<Integer> keys=hm.keySet();
        int max=0;
        for(int i : keys)
        {
            if(hm.get(i)>max)
            max=hm.get(i);
        }
        ArrayList<Integer> ar=new ArrayList<>();
         for(int i : keys)
        {
            if(hm.get(i)==max)
            ar.add(i);
        }
        int[] arr=new int[ar.size()];
        for(int i=0;i<ar.size();i++)
        {
            arr[i]=ar.get(i);
        }
        return arr;
    }
}