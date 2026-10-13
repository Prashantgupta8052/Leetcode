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
    public int pairSum(ListNode head) {
      ArrayList<Integer> ans =new ArrayList<>();
      while(head!=null){
        ans.add(head.val);
        head=head.next;
      }  
      int left=0;
      int right=ans.size()-1;
      int max =0;
      while(left<right){
        int sum=ans.get(left)+ans.get(right);
        max=Math.max(max,sum);
        left++;
        right--;
      }
      return max;
    }
}