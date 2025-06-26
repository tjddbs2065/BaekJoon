package com.Questions;

import java.io.*;

public class Q1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int[] dp = new int[num + 1];

        if(num >= 1)
            dp[1] = 1;
        if(num >= 2)
            dp[2] = 2;

        for(int i = 3; i < num + 1; i++){
            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
        }

        bw.write(dp[num]+"");
        bw.flush();
    }
}
