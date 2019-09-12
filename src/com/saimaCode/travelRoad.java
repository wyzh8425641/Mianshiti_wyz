package com.saimaCode;

import java.util.*;
import java.util.Arrays;

public class travelRoad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();
        int[][] distance = new int[N + 1][N + 1];
        for(int i = 0; i <= N; i++) {
            Arrays.fill(distance[i], Integer.MAX_VALUE);
            distance[i][i] = 0;
        }
        int[] tar = new int[R + 1];
        for(int i = 1; i <= R; i++) {
            tar[i] = sc.nextInt();
        }
        for(int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c = sc.nextInt();
            distance[x][y] = c;
            distance[y][x] = c;
        }
        for(int k = 1; k <= N; k++) {
            for(int i = 1; i <= N; i++) {
                for(int j = i + 1; j <= N; j++) {
                    if(distance[i][k] != Integer.MAX_VALUE && distance[k][j] != Integer.MAX_VALUE) {
                        distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
                        distance[j][i] = distance[i][j];
                    }
                }
            }
        }
        distance[0][0] = 0;
        int s = 1 << R;
        int[][] dp = new int[s + 1][R + 1];
        for(int i = 0; i <= s; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        for(int i = 1; i <= s; i++) {
            for(int j = 1; j <= R; j++) {
                if(((i >> j - 1) & 1) > 0) {
                    if(i == (1 << j - 1)) {
                        dp[i][j] = 0;
                    } else {
                        for(int k = 1; k <= R; k++) {
                            if(((i >> k - 1) & 1) > 0) {
                                dp[i][j] = Math.min(dp[i ^ (1 << j - 1)][k] + distance[tar[k]][tar[j]], dp[i][j]);

                            }
                        }
                    }
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i <= R; i++) {
            ans = Math.min(ans, dp[(1 << R)- 1][i]);
        }
        System.out.println(ans);
    }
}