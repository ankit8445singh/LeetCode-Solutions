class Solution {
    public int reverse(int x) {
        int revs = 0;
        
        while(x!=0){
            if(revs>Integer.MAX_VALUE/10 ||
            revs<Integer.MIN_VALUE/10){
                return 0;
            }
            revs=x%10+revs*10;
            x=x/10;
        }
        

        
        return revs;
    }
}