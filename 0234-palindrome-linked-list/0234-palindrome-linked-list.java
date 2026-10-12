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
    //     ListNode slow=head; 
    //     ListNode fast=head;
    //     while(fast.next!=null && fast.next.next!=null){
    //         slow =slow.next;
    //         fast =fast.next.next;
    //     }
    //     ListNode head2=slow.next;
    //     slow.next=null;
    //     head2=reverse(head2);
    //     ListNode i=head;
    //     ListNode j=head2;
    //     while(j!=null){
    //         if(i.val!=j.val) return false;
    //         i=i.next;
    //         j=j.next;

    //     }
    //     return true;
    // }
    // public ListNode reverse(ListNode head){
    //         ListNode prev=null;
    //         ListNode current=head;
    //         ListNode fwd=null;
    //         while(current!=null){
    //             fwd=current.next;
    //             current.next=prev;
    //             prev=current;
    //             current=fwd;
    //         } 
    //         return prev;
    //     }
    ArrayList<Integer> ans =new ArrayList<>();
    ListNode curr=head;
    while(curr!=null){
        ans.add(curr.val);
        curr=curr.next;
    }
    int i=0; 
    int j=ans.size()-1;
    while(i<j){
        if(!ans.get(i).equals(ans.get(j))){
            return false;
        }
        i++;
        j--;
    }
    return true;
    }
}
