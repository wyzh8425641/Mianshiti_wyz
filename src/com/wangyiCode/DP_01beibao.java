package com.wangyiCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DP_01beibao {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(",");
        int m = Integer.parseInt(strs[0]);//可容纳的资产 条
        int n = Integer.parseInt(strs[1]);//资产种类
        String[] sp1 = strs[2].split(" ");
        String[] sp2 = strs[3].split(" ");
        int[] kinds = new int[n];
        int[] prices = new int[n];
        for (int i = 0; i < sp1.length; i++) {
            kinds[i] = Integer.parseInt(sp1[i]);
            prices[i] = Integer.parseInt(sp2[i]);
        }
        //动态规划
        int[][] dp = new int[n + 1][m + 1];//dp[i][j]，资产种类为i，背包重量为j
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                //放入第i个种类的物品，该背包的剩余重量比i类物品的重量大或者相等
                //dp[i - 1][j] 为背包重量为j,不放入第i个物品的最大价值，
                // 和放入第i个物品时候的价值+前面i-1类中背包容量为j-
                /**
                 * dp[i - 1][j] 为背包重量为j,不放入第i个物品的最大价值
                 * dp[i - 1][j - kinds[i - 1]] + prices[i - 1] 为放入第i个物品+前i-1个物品中背包容量为j-i物品的重量的最大值
                 */
                if (j - kinds[i - 1] >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - kinds[i - 1]] + prices[i - 1]);
                }else {//该类物品的重量大于背包的剩余重量了，装不下
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
