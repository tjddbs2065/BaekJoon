package com.Questions;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Q14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<String> S = new ArrayList<>();
        String[] C = new String[m];

        for(int i = 0; i < n; i++) S.add(br.readLine());
        for(int i = 0; i < m; i++) C[i] = br.readLine();

        long cnt = Arrays.stream(C).filter(S::contains).count();

        bw.write(cnt + "");
        bw.flush();
    }
}
