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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans =new ArrayList<>();
        solve(root,"",ans);
        return ans;
    }
    public void solve(TreeNode root, String s,ArrayList<String> ans){
        if(root==null){
            return;
        }
        s=s+root.val;
        if(root.left==null && root.right==null){
            ans.add(s);
            return;
        }
        s=s+"->";
        solve(root.left,s,ans);
        solve(root.right,s,ans);


    }
}