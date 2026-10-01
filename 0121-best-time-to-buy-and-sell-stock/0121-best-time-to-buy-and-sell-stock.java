class Solution {
    public int maxProfit(int[] nums) {
        int n =nums.length;
        int max=0; 
        int min=nums[0];
        for(int i=1; i<n; i++){
            if(min>nums[i]){
                min=nums[i];
            }
            int profit=nums[i]-min;
            if(profit>max){
                max=profit;
            }
        }
        return max;
        
    }
}