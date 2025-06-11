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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur1=list1,cur2=list2;
        ListNode head=null;
        ListNode cur=null,temp;
        if(list1==null)
        return list2;
        if(list2==null)
        return list1;
        while(cur1!=null&&cur2!=null)
        {
            if(cur1.val<cur2.val)
            {
                temp=cur1;
                cur1=cur1.next;
            }
            else
            {
                temp=cur2;
                cur2=cur2.next;
            }
            if(head==null)
            {
                head=temp;
                cur=head;
            }
            else
            {
                cur.next=temp;
                cur=cur.next;
            }
        }
        while(cur1!=null)
        {
            cur.next=cur1;
            cur=cur.next;
            cur1=cur1.next;
        }
        while(cur2!=null)
        {
            cur.next=cur2;
            cur=cur.next;
            cur2=cur2.next;
        }
        return head;
    }
}