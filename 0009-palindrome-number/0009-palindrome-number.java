class Solution {
    public boolean isPalindrome(int x) {
       int revs = 0;
       int n = x;
       if(x<0){
        return false;
       }
       while(x!=0){
        int d = x%10;
        revs = d+revs*10;
        x=x/10;
       }
       
       if(revs==n){
        return true;
       }else{
        return false;
       }

    }
}