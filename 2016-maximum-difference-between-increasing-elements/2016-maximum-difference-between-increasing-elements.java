class Solution {
    public int maximumDifference(int[] nums) {
        int min=nums[0];
        int max=-1;
        int n=nums.length;
        for(int i=1; i<n; i++){
            if(nums[i]>min){
                max=Math.max(max,nums[i]-min) ;
            }
            min=Math.min(min,nums[i]);
        }
        return max;
    }
}