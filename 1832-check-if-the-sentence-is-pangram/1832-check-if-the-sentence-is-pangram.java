class Solution {
    public boolean checkIfPangram(String s) {
        int n=s.length();
        boolean [] ans =new boolean[26];
        for(char ch :s.toCharArray()){
            ans[ch-'a']=true;
        }
        for(boolean ele :ans ){
            if(!ele){
                return false ;
            }
        }
        return true;

    }
}