class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> st = new HashSet<>();
        for(int num:arr){
            if(st.contains(num*2)||(st.contains(num/2)&&(num%2==0))){
                return true;
            }
            st.add(num);
        }
        return false;
    }
}