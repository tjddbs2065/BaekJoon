package com.Questions;

import java.io.*;

public class Q10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rep = Integer.parseInt(br.readLine());

        int[] dp = new int[rep + 1];
        if(rep >= 0)
            dp[0] = 1;

        for(int i = 1; i < rep + 1; i++){
            dp[i] = i * dp[i - 1];
        }
        bw.write(dp[rep]+"");
        bw.flush();
    }
}
