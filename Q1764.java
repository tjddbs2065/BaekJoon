package com.Questions;

import java.io.*;
import java.util.*;

public class Q1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> noSee = new HashSet<>();
        for(int i = 0; i < n; i++){
            noSee.add(br.readLine());
        }

        List<String> whoIsIt = new ArrayList<>();
        for(int i = 0; i < m; i++){
            String str = br.readLine();
            if(noSee.contains(str)){
                whoIsIt.add(str);
            }
        }

        Collections.sort(whoIsIt);

        bw.write(whoIsIt.size()+"\n");
        for(String str: whoIsIt)
            bw.write(str+"\n");

        bw.flush();
    }
}
