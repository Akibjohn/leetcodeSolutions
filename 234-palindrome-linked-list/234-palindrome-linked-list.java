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
        ListNode mid=middleNode(head) , sh=mid.next;
        mid.next=null;
        sh=reverseList(sh);
        while(head!=null && sh!=null){
            if(head.val != sh.val){
                 return false;
            }
            head=head.next;
            sh=sh.next;
            
        }
        return true;
        
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode p=null, c=head ,n=head;
        while(c!=null){
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        head=p;
        return p;
        
    }
}