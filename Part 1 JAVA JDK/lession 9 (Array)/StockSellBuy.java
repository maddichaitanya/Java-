public class StockSellBuy {
    public static int buysellstock(int price[]) {
        // int sellday = 0;
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        // int profitday = 0;
        for (int i = 0; i < price.length; i++) {

            if (buyprice < price[i]) { // profit
                int profit = price[i] - buyprice; // today's profit
                maxprofit = Math.max(maxprofit, profit); // max value of maxprofit and profit
                // profitday = price[i];
            } else {
                buyprice = price[i];

            }

        }
        // System.out.println("Profit day = " + profitday);
        return maxprofit;
    }

    public static void main(String args[]) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("profit of the stock = " + buysellstock(price) + "$");

    }

}
