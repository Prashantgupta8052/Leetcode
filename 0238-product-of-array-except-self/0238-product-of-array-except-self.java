class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] ans =new int[n];
        int prodL=1; 
        int prodR=1;
        // first we calucalate the right side of product of given element
        for(int i=n-1; i>=0; i--){
            ans[i]=prodR;
            prodR=prodR*nums[i];
        }
        //now caluclate the left side of product
        for(int i=0; i<n; i++){
            ans[i]=ans[i]*prodL;
            prodL=prodL*nums[i];
        }
        return ans;
    }
}