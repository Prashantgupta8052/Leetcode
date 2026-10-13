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
    //public static ListNode reverse(ListNode head){
    //     ListNode prev=null;
    //     ListNode current=head;
    //     ListNode fwd=null;
    //     while(current!=null){
    //         fwd =current.next;
    //         current.next=prev;
    //         prev=current;
    //         current =fwd;
    //     }
    //     return prev;
    // }
    public ListNode reverseBetween(ListNode head, int left, int right) {
    //     if(head==null || left==right ) return head;
    //     ListNode dummy =new ListNode(-1);
    //     ListNode temp=dummy;
    //     dummy.next=head;
    //     for(int i=1; i<=left-1; i++){
    //         temp=temp.next;
    //     }
    //     ListNode tail1=temp;
    //     ListNode head2=tail1.next;
        
    //     for(int i=1; i<=right-left+1;i++){
    //         temp=temp.next;
    //     }
    //     ListNode tail2=temp;
    //     ListNode head3=temp.next;
    //     tail1.next=null;
    //     tail2.next=null;
    //     ListNode newhead=reverse(head2);
    //     tail1.next=newhead;
    //     head2.next=head3;
    //     return dummy.next;
    if(head==null || left==right ) return head;
    ArrayList<Integer> ans=new ArrayList<>();
    ListNode temp=head;
    while(temp!=null){
        ans.add(temp.val);
        temp=temp.next;
    }
    while(left<right){
        int b=ans.get(left-1);
        ans.set(left-1,ans.get(right-1));
        ans.set(right-1,b);
        left++;
        right--;
    }
    temp =head;
    int i=0;
    while(temp!=null){
        temp.val=ans.get(i);
        temp=temp.next;
        i++;
    }
    return head;
    }
}