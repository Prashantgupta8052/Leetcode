class Solution {
    public void swap(int low, int high,int [] nums){
        int temp=nums[high];
        nums[high]=nums[low];
        nums[low]=temp;
    }
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        
        int high=0;
        for(int low=0; low<n; low++){
            if(nums[low]!=0){
                swap(low, high,nums);
                high++;
            }
        }

    }
}