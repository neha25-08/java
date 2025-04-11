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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        n=count-n+1;
        if(n==1)
        {
            head=head.next;
            return head;
        }
        else
        {
            temp=head;
            int i=0;
            while(i<n-2)
            {
                temp=temp.next;
                i++;
            }
            temp.next=temp.next.next;
        }
       // System.out.println(count);
        return head;
    }
}