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
    void inorder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }

    void changes(TreeNode root, int a, int b) {
        if (root == null) return;
        if (root.val == a) {
            root.val = b;
        } else if (root.val == b) {
            root.val = a;
        }
        changes(root.left, a, b);
        changes(root.right, a, b);
    }

    public void recoverTree(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);

        ArrayList<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);

        Integer x = null, y = null;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.get(i).equals(sorted.get(i))) {
                if (x == null) x = arr.get(i);
                else y = arr.get(i);
            }
        }

        if (x != null && y != null) {
            changes(root, x, y);
        }
    }
}
