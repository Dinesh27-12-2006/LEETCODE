class Solution {
    public int maxProfit(int[] price) {

        int buy = price[0];
        int max=0;
        for(int i=1;i<price.length;i++){
            if(price[i]<buy){
                buy=price[i];

            }
            else{
                int profit=price[i]-buy;
                if(profit>max){
                    max=profit;
                }
            }
           
        } return max;

        
    }
}