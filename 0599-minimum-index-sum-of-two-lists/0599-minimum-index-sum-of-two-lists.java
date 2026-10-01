class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        int m = list1.length;
        int n = list2.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(list1[i].equals(list2[j])){
                    int sum = i+j;
                    if(sum<min){
                        min=sum;
                        result.clear();
                        result.add(list1[i]);
                    }else if(sum==min){
                        result.add(list1[i]);
                    }
                }
            }
        }
        return result.toArray(new String[1]);
    }
}