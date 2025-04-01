package pro;
/**
 * 
 */

class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        int profit2 = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {                 // buy
                buy = prices[i];    
                System.out.println("buy: " + buy);
            } else if (prices[i] - buy > profit) { // sell
                profit2 += prices[i] - buy;
                System.out.print(prices[i] + " - " + buy + " = " +profit2 + " ");
                buy = prices[i];
                profit = 0;
            }
            System.out.println();
        }
        return profit2;
    }
}
