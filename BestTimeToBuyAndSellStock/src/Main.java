/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 121. Best Time to Buy and Sell Stock
 * */
public class Main {
    public static void main(String[] args) {
        int result = resultMethod(new int[]{7, 6, 4, 3, 1});
        System.out.println(result);
    }

    private static int resultMethod(int[] prices) {
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
    }

}