package com.Questions;

import java.io.*;

public class Q15439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        bw.write(num*num-num+"");
        bw.flush();
    }
}
