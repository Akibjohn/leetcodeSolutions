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
    public ListNode getAt(ListNode head, int idx){
        ListNode temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int si=left, ei=right;
        while(si<ei){
            ListNode lNode=getAt(head,si) , rNode=getAt(head,ei);
            int temp=lNode.val;
            lNode.val=rNode.val;
            rNode.val=temp;
            si++;
            ei--;
        }
        return head;
    }
}