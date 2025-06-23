package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int rep = Integer.parseInt(br.readLine());

        int[][] dp = new int[101][101];
        for(int i = 1; i < 100 + 1; i++) dp[1][i] = i;

        for(int r = 0; r < rep; r++){
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if(dp[N][M] == 0) {
                for (int i = 2; i < N + 1; i++) {
                    for (int j = i; j < M + 1; j++) {
                        if(dp[i][j] == 0)
                            dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
                    }
                }
            }
            System.out.println(dp[N][M]);
        }
    }
}
