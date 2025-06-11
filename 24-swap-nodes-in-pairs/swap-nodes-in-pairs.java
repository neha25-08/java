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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode cur=head;
        ListNode prev=null;
        ListNode next=null;
        ListNode fnext=head;
        while(fnext!=null&&fnext.next!=null)
        {
            next=fnext.next;
            cur=fnext;
            if(prev==null)
            {
                head=next;
            }
            else
            {
                prev.next=next;
            }
            fnext=next.next;
            next.next=cur;
            cur.next=fnext;
            prev=cur;
        }
        return head;
    }
}