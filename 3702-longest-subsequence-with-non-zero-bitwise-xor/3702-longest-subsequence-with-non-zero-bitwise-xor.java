class Solution {
    public int longestSubsequence(int[] nums) {
     int n = nums.length;
     int zero = 0;
     int xr = 0;
     for(int num:nums){
        xr^=num;
        if(num==0) zero++;
     }   
     if(xr!=0) return n;
     if(zero==n) return 0;
     return n-1;
    }
}