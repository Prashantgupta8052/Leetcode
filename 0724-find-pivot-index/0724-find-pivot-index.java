class Solution {
    public int pivotIndex(int[] nums) {
        int n =nums.length;
        int total_sum=0;
        for(int i=0; i<n ; i++){
            total_sum+=nums[i];
        } 
        int lsum=0;
        for(int j=0; j<n; j++){
            int rsum=total_sum-lsum-nums[j];
            if(rsum==lsum){
                return j;
            }
            lsum+=nums[j];
        }
        return -1;  
    }
}