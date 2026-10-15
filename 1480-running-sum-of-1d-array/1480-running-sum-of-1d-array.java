class Solution {
    public int[] runningSum(int[] nums) {
        int idx=0;
        int sum=0; 
        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
            nums[idx++]=sum;
        }
        return nums;
    }
}