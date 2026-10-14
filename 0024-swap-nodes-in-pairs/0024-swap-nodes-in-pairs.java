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
        // if(head==null || head.next==null){
        //      return head;
        // }
        // ArrayList<Integer> ans =new ArrayList<>();
        // ListNode curr=head;
        // while(curr!=null){
        //     ans.add(curr.val);
        //     curr=curr.next;
        // }
        // for(int i=0; i<ans.size()-1; i+=2){
        //     int temp=ans.get(i);
        //     ans.set(i,ans.get(i+1));
        //     ans.set(i+1,temp);
        // }
        // curr=head;
        // int index=0;
        // while(curr!=null){
        //     curr.val=ans.get(index);
        //     curr=curr.next;
        //     index++;
        // }
        // return head;
        if(head==null || head.next==null)
        return head;
        ListNode d=new ListNode(-1);
        ListNode a=head;
        ListNode b=head.next;
        ListNode c=d;
        while(a!=null && b!=null){
            c.next=b;
            a.next=b.next;
            b.next=a;
            c=a;
            a=a.next;
            if(a!=null) b=a.next; 
        }
        return d.next;
    }

}