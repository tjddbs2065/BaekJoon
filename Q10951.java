package com.Questions;

import java.io.*;
import java.util.StringTokenizer;

public class Q10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str;
        while((str = br.readLine()) != null){
            if(str.trim().isEmpty()) continue;

            st = new StringTokenizer(str);
            if(st.countTokens() < 2) continue;

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write((a+b) + "\n");
        }
        bw.flush();
    }
}
