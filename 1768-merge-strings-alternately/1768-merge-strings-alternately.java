class Solution {
    public String mergeAlternately(String word1, String word2) {
        int lenA= word1.length();
        int lenB = word2.length();
        StringBuilder str = new StringBuilder();
        int i=0;
        int j=0;
        while(i<lenA || j<lenB){
            if(i<lenA){
                str.append(word1.charAt(i));
                i++;
            }
            if(j<lenB){
                str.append(word2.charAt(j));
                j++;
            }
        }
        return str.toString();
    }
}