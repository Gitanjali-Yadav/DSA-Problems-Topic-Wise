public class Q_BuyAndSellStock {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyAndSellStock(prices));
    }

    public static int buyAndSellStock(int prices[]){
        int buyingPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyingPrice<prices[i]){
                //profit
                int currentProfit=prices[i]-buyingPrice;
                maxProfit=Math.max(maxProfit, currentProfit);
            }else{
                //if(buyingPrice>current index)
                buyingPrice=prices[i];
            }
        }
        return maxProfit;
    }
}
