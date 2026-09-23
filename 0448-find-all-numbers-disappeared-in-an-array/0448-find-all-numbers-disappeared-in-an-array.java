class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n =nums.length;
        ArrayList<Integer> ans =new ArrayList<>();
        //first step we traversing the array marking who present in the array 
        for(int i =0; i<n ; i++){
            int idx= Math.abs(nums[i])-1;
            if(nums[idx] < 0){
                continue;
            }
            nums[idx]=nums[idx]*-1;
        }
        //second step we add the element in the array who not present inthe nums
        for(int i=0; i<n ; i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans ;
    }
}
