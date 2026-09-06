class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> ans =new ArrayList<>();
        for(int ele : nums){
             set.add(ele);
        }
        for(int i=nums[0] ; i<=nums[n-1]; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}