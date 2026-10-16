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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode i=head; 
        ListNode j=head;
        while(j!=null){
           if(i.val==j.val) j=j.next;
           else{
            i.next=j;
            i=j;
           }
        }
        i.next=j;
        return head;
       
    }
}
// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         // if(head==null) return null;
//         // ListNode i=head; 
//         // ListNode j=head;
//         // while(j!=null){
//         //    if(i.val==j.val) j=j.next;
//         //    else{
//         //     i.next=j;
//         //     i=j;
//         //    }
//         // }
//         // i.next=j;
//         // return head;
//         ArrayList<Integer> ans= new ArrayList<>();
//         ListNode temp=head;
//         while(temp!=null){
//             ans.add(temp.val);
//             temp=temp.next;
//         }
//         temp=head;
//         int i=0; 
//         for(int j=0; j<ans.size(); j++){
//             if(ans.get(i)!=ans.get(j)){
//                 i++;
//                 ans.set(i,ans.get(j));
//             }
//         }
//         int index=0;
//         while(temp!=null){
//             temp.val=ans.get(index);
//             index++;
//             temp=temp.next;
//         }
//         return head;
//     }
// }