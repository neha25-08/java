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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev=null;
        ListNode cur=head;
        ListNode next;
        ListNode nhead=null;
        ListNode ncur=null;
        while(cur!=null)
        {
            next=cur.next;
            if((prev==null||cur.val!=prev.val)&&(next==null||cur.val!=next.val))
            {
                if(nhead==null)
                {
                    nhead=cur;
                    ncur=nhead;
                }
                else
                {
                    ncur.next=cur;
                    ncur=ncur.next;
                }
            }
            prev=cur;
            cur=next;
        }
        if (ncur != null) {
            ncur.next = null; // terminate new list
        }
        return nhead;
    }
}