class Solution {
    public int squareofSum(int n){
        int sum=0;
        while(n>0){
            int digit = n%10;
            n=n/10;
            sum+=digit*digit;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
     
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=squareofSum(n);
        }
        return n==1;
      
    }
}