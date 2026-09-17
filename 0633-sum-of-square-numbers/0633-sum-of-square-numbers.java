class Solution {
    public boolean judgeSquareSum(int c) {
       double a=0;
       double b= (int)Math.sqrt(c);
       while(a<=b){
        double sum=a*a+ b*b;
        if(sum==c){
            return true;
        }
        else if(sum<c){
            a++;
        }
        else{
            b--;
        }

       } 
       return false;
    }
}