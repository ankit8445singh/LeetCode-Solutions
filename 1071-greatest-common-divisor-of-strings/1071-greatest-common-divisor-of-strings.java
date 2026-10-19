class Solution {
    public int gcd(int a,int b){
            if(b==0){
                return a;
            }
            return gcd(b,a%b);
        }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int lenA = str1.length();
        int lenB= str2.length();
        int gcd = gcd(lenA,lenB);

        return str1.substring(0,gcd);

    }
}