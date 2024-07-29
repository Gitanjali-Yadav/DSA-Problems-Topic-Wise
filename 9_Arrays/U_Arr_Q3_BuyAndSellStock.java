public class U_Arr_Q3_BuyAndSellStock {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};

        // int prices[]={7, 6, 4, 3, 1};


        System.out.println("Maximum profit can be made on the day = "+ calculateProfit(prices));

    }

    public static int calculateProfit(int prices[]){
        int buyingPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyingPrice<prices[i]){
                //profit
                int currentProfit=(prices[i]- buyingPrice);

                maxProfit=Math.max(maxProfit, currentProfit);

            }else{
                buyingPrice=prices[i];
            }
        }
        return maxProfit;
    }
}
