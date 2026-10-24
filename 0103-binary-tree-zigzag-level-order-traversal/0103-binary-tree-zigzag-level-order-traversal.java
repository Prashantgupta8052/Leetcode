/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans =new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return ans;
        q.add(root);
        boolean flag=true;
        while(q.size()>0){
            List<Integer> list=new ArrayList<>();
            int size=q.size();
            for(int i=0; i<size ; i++){
                TreeNode temp= q.remove();
                if(flag){
                    list.add(temp.val);
                }
                else{
                    list.add(0,temp.val);
                }
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            ans.add(list);
            flag=!flag;
        }
        return ans;
    }
}