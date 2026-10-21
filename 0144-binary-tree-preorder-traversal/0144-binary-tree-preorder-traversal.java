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
    public List<Integer> preorderTraversal(TreeNode root) {
         ArrayList<Integer> ans =new ArrayList<Integer> ();
        //   if(root==null) return ans;
        //   Stack<TreeNode> st=new Stack<>();
        //   st.push(root);
        //   while(st.size()>0){
        //     root=st.pop();
        //     ans.add(root.val);
        //     if(root.right!=null){
        //     st.push(root.right);
        //     }
        //     if(root.left!=null){
        //         st.push(root.left);
        //     }
        //   }
        //   return ans;
        solve(root, ans);
        return ans;

    }
    public void solve(TreeNode root, ArrayList<Integer> ans){
        if(root==null) return;
        ans.add(root.val);
        solve(root.left,ans);
        solve(root.right,ans);
    }
}