class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count =0; 
        int max=0;
        int j=0;
        while(j<n){
            if(nums[j]==1){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=0;
            }
            j++;

        }
        return Math.max(max,count) ;
    }
}