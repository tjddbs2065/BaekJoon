package com.Questions;

import java.io.*;

public class Q9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rep = Integer.parseInt(br.readLine());

        long[] dp = new long[101];

        dp[1] = 1;
        dp[2] = 1;

        int num = 3;
        for(int i = 0; i < rep; i++){
            num = Integer.parseInt(br.readLine());

            for(int j = 3; j <= num; j++){
                dp[j] = dp[j - 2] + dp[j - 3];
            }
            bw.write(dp[num]+"\n");
        }
        bw.flush();
    }
}
