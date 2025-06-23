package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rep = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int[][] arr = new int[rep][3];
        int[][] dp = new int[rep][3];
        for(int i = 0; i < rep; i++){
            st = new StringTokenizer(br.readLine());
            dp[i][0] = Integer.parseInt(st.nextToken());
            dp[i][1] = Integer.parseInt(st.nextToken());
            dp[i][2] = Integer.parseInt(st.nextToken());
        }


        for(int i = 1; i < rep; i++){
            for(int j = 0; j < 3; j++){
                dp[i][j] += Math.min(dp[i-1][(j+1) % 3], dp[i-1][(j + 2) % 3]);
            }
        }

        int minValue = dp[rep-1][0];
        for(int i = 1; i < 3; i++) minValue = Math.min(minValue, dp[rep-1][i]);

        System.out.println(minValue);
    }
}
