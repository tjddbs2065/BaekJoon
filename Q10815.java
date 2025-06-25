package com.Questions;

import java.io.*;
import java.util.*;

public class Q10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int nCnt = Integer.parseInt(br.readLine());
        List<Integer> map = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < nCnt; i++){
            map.add(Integer.parseInt(st.nextToken()));
        }

        nCnt = Integer.parseInt(br.readLine());
        int[] mArr = new int[nCnt];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < nCnt; i++){
            mArr[i] = Integer.parseInt(st.nextToken());
        }

        int[] filteredArr = Arrays.stream(mArr).map(n -> map.contains(n) ? 1 : 0).toArray();
        for(int i : filteredArr) bw.write(i + " ");
        bw.flush();
    }
}
