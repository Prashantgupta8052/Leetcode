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
        int x=size(head);
        int y=x-n;
        ListNode curr=head;
        if(y==0){
            return head.next;
        }
        for(int i=1; i<y; i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
    public int size(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}