package com.study;
//8天的股价和冷冻期K，求最大盈利
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();

            int[] prices = new int[n + 1];
            for (int i = 1; i < prices.length; i++) {
                prices[i] = sc.nextInt();
            }

            int k = sc.nextInt();

            int[] dp = new int[n + 1];
            int cur = -1000000,ans = 0;

            for (int i = 1; i < dp.length; i++) {
                int price = prices[i];
                dp[i] = Math.max(dp[i - 1], cur + price);
                cur = i >= k?Math.max(cur, dp[i - k] - price):Math.max(cur, -price);
                ans = Math.max(ans, dp[i]);
            }

            System.out.println(ans);
        }
    }

}
