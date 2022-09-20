package com.practice.example.core.easy;

public class GetTimeToBuyStocks {

    public static void main(String[] args) {
        int[] num = {7, 1, 5, 3, 6, 4, 8};
        System.out.println(maxProfit(num));
    }

    public static int maxProfit(int[] prices) {

        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
    }
}
