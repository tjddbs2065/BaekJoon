package com.Questions;

import java.io.*;
import java.util.StringTokenizer;

public class Q11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] dp = new int[n + 1];
        if(n > 0)
            dp[0] = 1;

        for(int i = 1; i < n + 1; i++){
            dp[i] = dp[i-1] * i;
        }

        bw.write(dp[n] / (dp[k] * dp[n-k])+"");
        bw.flush();
    }
}
