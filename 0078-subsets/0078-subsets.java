class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp=new ArrayList<>();
        solve(0,nums, temp, ans); 
        return new ArrayList<>(ans);
    }
    public void solve(int idx, int[] nums, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans){
        if(idx>=nums.length){
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        temp.add(nums[idx]);
        solve(idx+1, nums, temp, ans);
        temp.remove(temp.size()-1);
        solve(idx+1,nums, temp,ans);
    }
}