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
    int sum(TreeNode root)
    {
        if(root==null)
        return 0;
        int x= root.val+sum(root.left)+sum(root.right);
        if(hm.containsKey(x))
        {
            hm.put(x,hm.get(x)+1);
        }
        else
        hm.put(x,1);
        return x;
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        int max=0;
        sum(root);
        Set<Integer> keys=hm.keySet();
        for(int i:keys)
        {
            if(hm.get(i)>max)
            {
                max=hm.get(i);
            }
        }
        int j=0;
        int[] arr=new int[hm.size()];
        for(int i:keys)
        {
            if(hm.get(i)==max)
            {
                arr[j]=i;
                j++;
            }
        }
        return Arrays.copyOfRange(arr,0,j);
    }
}