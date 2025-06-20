package com.Questions;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 계단 오르기
public class Q2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rep = Integer.parseInt(br.readLine());

        int[] stairs = new int[rep + 1];
        for(int i = 1; i < rep+1; i++) stairs[i] = Integer.parseInt(br.readLine());

        int[] dp = new int[rep + 1];
        if(rep >= 1)
            dp[1] = stairs[1];
        if(rep >= 2)
            dp[2] = stairs[1] + stairs[2];
        if(rep >= 3)
            dp[3] = Math.max(dp[1] + stairs[3], stairs[2] + stairs[3]);

        for (int i = 4; i < rep + 1; i++) {
            dp[i] = Math.max(dp[i - 2] + stairs[i], dp[i - 3] + stairs[i - 1] + stairs[i]);
        }
        System.out.println(dp[rep]);
    }
}
