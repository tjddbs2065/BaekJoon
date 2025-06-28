package com.Questions;

import java.io.*;
import java.util.StringTokenizer;

public class Q1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rep = Integer.parseInt(br.readLine());

        int dp[][] = new int[rep + 1][rep + 1];

        StringTokenizer st;
        for(int i = 1; i <= rep; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= i; j++){
                int num = Integer.parseInt(st.nextToken());
                if(i == 1) dp[i][j] = num;

                dp[i][j] = Math.max(num + dp[i - 1][j - 1], num + dp[i-1][j]);
            }
        }
        int max = 0;
        for(int val : dp[rep]) max = Math.max(max, val);

        bw.write(max+"");
        bw.flush();
    }
}
