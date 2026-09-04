class Solution {
    public int maxProfit(int[] prices) {
       int buyPrice = Integer.MAX_VALUE;
       int maxprofit = 0;
       for(int price:prices){
        if(price<buyPrice){
            buyPrice=price;
        }
        if(price-buyPrice>maxprofit){
            maxprofit=price-buyPrice;
        }
       }
       return maxprofit;
    }
}