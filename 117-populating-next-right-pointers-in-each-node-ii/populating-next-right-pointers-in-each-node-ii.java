/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)
        return root;
        if((root.left==null&&root.right==null))
        {
            root.next=null;
            return root;
        }
        Queue<Node> q=new LinkedList<>();
         Queue<Node> res=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node x=q.remove();
            res.add(x);
            if(x==null)
            {
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            }
            else
            {
                if(x.left!=null)
                {
                    q.add(x.left);
                }
                if(x.right!=null)
                {
                    q.add(x.right);
                }
            }
        }
        
        Node prev=res.remove();
        while(!res.isEmpty())
        {
             Node x=res.remove();
             prev.next=x;
             if(x==null)
             {
                if(!res.isEmpty())
                prev=res.remove();
                else
                break;
             }
             else
             {
                prev=x;
             }
        }
        return root;
    }
}