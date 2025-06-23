package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[len];
        int[] dp = new int[len];

        for(int i = 0; i < len; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        dp[0] = arr[0];
        int maxTotal = dp[0];
        for(int i = 1; i < len; i++){
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            maxTotal = Math.max(maxTotal, dp[i]);
        }

        System.out.println(maxTotal);
    }
}
