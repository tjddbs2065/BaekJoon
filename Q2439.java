package com.Questions;

import java.io.*;

public class Q2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(n - j < i) sb.append("*");
                else sb.append(" ");

            }
            bw.write(sb.toString() + "\n");
            sb.setLength(0);
        }
        bw.flush();
    }
}
