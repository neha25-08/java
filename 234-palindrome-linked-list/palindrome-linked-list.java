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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> St=new Stack<>();
        ListNode temp=head;
        while(head!=null)
        {
            St.push(head.val);
            head=head.next;
        }
        head=temp;
        while(head!=null)
        {
            if(head.val!=St.pop())
            return false;
            head=head.next;
        }
        return true;
    }
}