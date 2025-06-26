package com.Questions;

import java.io.*;
import java.util.*;

public class Q10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            int key = Integer.parseInt(st.nextToken());

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            int key = Integer.parseInt(st.nextToken());

            if(map.containsKey(key)){
                bw.write(map.get(key) + " ");
            }
            else bw.write("0 ");
        }
        bw.flush();
    }
}
