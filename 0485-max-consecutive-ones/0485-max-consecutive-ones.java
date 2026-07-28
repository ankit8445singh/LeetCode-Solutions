class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int Max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                count=0;
            }
            Max = Math.max(count,Max);
        }
        return Max;
    }
}