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
    public ListNode partition(ListNode head, int x) {
        ListNode head1=null;
        ListNode head2=null;
        ListNode cur1=null,cur2=null;
        ListNode cur=head;
        while(cur!=null)
        {
            if(cur.val<x)
            {
                if(head1==null)
                {
                    head1=cur;
                    cur1=head1;
                }
                else
                {
                cur1.next=cur;
                cur1=cur1.next;
                }
            }
            else
            {
                if(head2==null)
                {
                    head2=cur;
                    cur2=head2;
                }
                else
                {
                    cur2.next=cur;
                    cur2=cur2.next;
                }
            }
            cur=cur.next;
        }
        if(cur2!=null)
            cur2.next=null;
        if(cur1!=null)
        {
            cur1.next=head2;
            return head1;
        }
        return head2;
    }
}