package com.Questions;

import java.io.*;
import java.util.StringTokenizer;

public class Q1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rep = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i = 0; i < rep; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int ans = a * (b / gcd(a, b));

            bw.write(ans+"\n");
        }
        bw.flush();
    }

    public static int gcd(int a, int b){
        while(b != 0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
