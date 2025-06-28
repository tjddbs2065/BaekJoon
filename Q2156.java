package com.Questions;

import java.io.*;

public class Q2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rep = Integer.parseInt(br.readLine());

        int[] arr = new int[rep + 1];
        int[] dp = new int[rep + 1];

        for(int i = 1; i <= rep; i++) arr[i] = Integer.parseInt(br.readLine());

        if(rep >= 1)
            dp[1] = arr[1];
        if(rep >= 2)
            dp[2] = arr[2] + dp[1];

        for(int i = 3; i <= rep; i++){
            dp[i] = Math.max(Math.max(dp[i-1], dp[i - 2] + arr[i]), dp[i - 3] + arr[i - 1] + arr[i]);
        }

        bw.write(dp[rep] + "");
        bw.flush();
    }
}
