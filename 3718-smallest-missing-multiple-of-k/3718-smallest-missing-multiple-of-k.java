class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        //step first we add k multiple in set 
        for(int ele:nums){
            if(ele%k==0){
                set.add(ele);
            }
        }
        //second step we check the lowest multiple in are had in set 
        int ans =k;
        while(set.contains(ans)){
            ans+=k;
        }
        return ans ;

    }
}