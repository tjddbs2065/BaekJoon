package com.Questions;

import java.io.*;
import java.util.StringTokenizer;

public class Q11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] dp = new int[n + 1];

        for(int i = 1; i < n+1; i++){
            dp[i] = dp[i-1] + Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(dp[b] - dp[a-1] +"\n");
        }

        bw.flush();
    }
}
