class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
         int n = prices.length;

        long originalProfit = 0;
        for (int i = 0; i < n; i++) {
            originalProfit += (long) prices[i] * strategy[i];
        }

        long[] prefixProfit = new long[n + 1];
        long[] prefixPrice = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefixProfit[i + 1] = prefixProfit[i] + (long) prices[i] * strategy[i];
            prefixPrice[i + 1] = prefixPrice[i] + prices[i];
        }

        long maxDelta = 0;

        for (int i = 0; i <= n - k; i++) {
            int j = i + k;
            int mid = i + k / 2;

            long oldProfit = prefixProfit[j] - prefixProfit[i];
            long newProfit = prefixPrice[j] - prefixPrice[mid];

            long delta = newProfit - oldProfit;
            if (delta > maxDelta) {
                maxDelta = delta;
            }
        }
        return originalProfit + maxDelta;
    }
}