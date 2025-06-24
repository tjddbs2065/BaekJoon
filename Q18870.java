package com.Questions;

import java.io.*;
import java.util.*;

public class Q18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rep = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[rep];
        for(int i = 0; i < rep; i++) arr[i] = Integer.parseInt(st.nextToken());

        int[] sorted = Arrays.stream(arr).distinct().sorted().toArray();

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < sorted.length; i++) map.put(sorted[i], i);

        int[] compressed = new int[arr.length];
        compressed = Arrays.stream(arr).map(map::get).toArray();

        for(int i : compressed) bw.write(i + " ");
        bw.flush();
    }
}
