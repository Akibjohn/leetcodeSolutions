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
        
        ListNode dummy=new ListNode(-1,head);
        ListNode s=dummy;
        ListNode e=dummy;
        
        for(int i=0;i<n;i++) e=e.next;
        while(e.next!=null){
            s=s.next;
            e=e.next;
        }
        s.next=s.next.next;
        return dummy.next;
        
        
        
    }
}