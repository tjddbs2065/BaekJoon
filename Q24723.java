package com.Questions;

import java.io.*;

public class Q24723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rep = Integer.parseInt(br.readLine());

        bw.write((int)Math.pow(2, rep)+"");
        bw.flush();
    }
}
