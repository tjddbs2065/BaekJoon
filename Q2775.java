package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int rep = Integer.parseInt(br.readLine());

        int[][] dp = new int[100][14];
        for(int i = 0; i < 14; i++) dp[0][i] = i+1;

        for(int i = 0; i < rep; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine()) - 1;

            for(int j = 1; j <= k; j++){
                for(int m = 0; m <= n; m++){
                    if(dp[j][m] != 0) continue;

                    if(m == 0) dp[j][m] = dp[j-1][m];
                    else dp[j][m] = dp[j-1][m] + dp[j][m-1];
                }
            }
            System.out.println(dp[k][n]);
        }
    }
}
