package com.Questions;

import java.io.*;
import java.util.StringTokenizer;

public class Q11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int rep = Integer.parseInt(br.readLine());

        for(int i = 0; i < rep; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + (i+1) +": " + (a+b) + "\n");
        }
        bw.flush();
    }
}
