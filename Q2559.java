package com.Questions;

import java.io.*;
import java.util.StringTokenizer;

public class Q2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] sums = new int[a + 1];
        st = new StringTokenizer(br.readLine());

        int max=0;
        for(int i = 1; i <= a; i++){
            sums[i] = sums[i-1] + Integer.parseInt(st.nextToken());
            if(i == b) max = sums[i] - sums[i - b];

            if(i > b) max = Math.max(max, sums[i] - sums[i-b]);
        }

        bw.write(max+"");
        bw.flush();
    }
}
