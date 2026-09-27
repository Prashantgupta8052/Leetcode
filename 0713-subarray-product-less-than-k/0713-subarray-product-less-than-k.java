class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int count=0; 
        int left=0;
        int prod=1;
        if(k<=1){
            return 0;
        }
        for(int i=0; i<n;i++){
            prod=prod*nums[i];
            while(prod>=k){
                prod=prod/nums[left];
                left++;
            }
            count=count+i-left+1;
        } 
        return count;
    }
}