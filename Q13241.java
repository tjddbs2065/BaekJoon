package com.Questions;

import java.io.*;
import java.util.StringTokenizer;

public class Q13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        long ans = a * (b / gcd(a,b));
        bw.write(ans+"");
        bw.flush();
    }

    public static long gcd(long a, long b){
        while(b != 0){
            long tmp =  b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
