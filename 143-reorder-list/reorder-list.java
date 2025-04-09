/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode mid(ListNode head)
    {
        ListNode fast=head.next,slow=head;
        while(fast!=null&& fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public void reorderList(ListNode head) {
        ListNode cur1=mid(head);
        ListNode cur=cur1.next;
        cur1.next=null;
        ListNode pre=null;
        //ListNode next;
        while(cur!=null)
        {
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        
        ListNode left=head;
        ListNode right=pre;
        ListNode newleft,newright;
        while(left!=null && right!=null)
        {
            newleft=left.next;
            left.next=right;
            newright=right.next;
            right.next=newleft;
            left=newleft;
            right=newright;
        }
    }
}