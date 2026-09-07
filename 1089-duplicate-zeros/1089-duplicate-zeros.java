class Solution {
    public void duplicateZeros(int[] arr) {
        int[] res = new int[arr.length];
        int j=0;
        int n=arr.length;
        for(int i=0;i<n && j<n;i++){
            if(arr[i]==0){
                res[j]=0;
                j++;
                if(j<n){
                    res[j]=0;
                    j++;
                }
            }else{
                res[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=res[i];
        }
        
    }
}