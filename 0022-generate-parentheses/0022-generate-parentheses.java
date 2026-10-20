class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans =new ArrayList<>();
        generator(0,0,"",ans,n);
        return ans;
    }
    public void generator(int left, int right, String s,ArrayList<String> ans,int n ){
        if(right==n){
            ans.add(s);
        }
        if(left<n){
            generator(left+1,right,s+"(",ans,n);
        
        }
        if(right<left){
            generator(left,right+1,s+")",ans,n);
        }
    }
}