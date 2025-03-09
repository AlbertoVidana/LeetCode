package pro;

public class BestTimetoBuyandSellStock {
	
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
        // int sell = 0;
        // for (int i = 0; i < prices.length; i++) {
        //     for (int j = i; j < prices.length; j++) {
        //         if(prices[j] - prices[i] > sell) {
        //             sell = prices[j] - prices[i];
        //         }
        //     }
        //     System.out.println();
        // }
        // return sell;
    }
}
