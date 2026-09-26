class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int zero_count=0;
        for(int r=0; r<n; r++){
            if(nums[r]==0){
                zero_count++;
            }
            if(zero_count>k){
                if(nums[left]==0){
                    zero_count--;
                }
                left++;
            }
        }
        return n-left;
    }
}