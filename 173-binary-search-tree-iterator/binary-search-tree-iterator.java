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
class BSTIterator {
    int count;
    ArrayList<Integer> arr;
    public BSTIterator(TreeNode root) {
     //BSTIterator bSTIterator = new BSTIterator(root);  
     arr=new ArrayList<>();
     inorder(root);
     count=0;
    }
    
    void inorder(TreeNode root)
    {
        if(root==null)
        return ;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
    public int next() {
        return arr.get(count++);
    }
    
    public boolean hasNext() {
        return count<arr.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */