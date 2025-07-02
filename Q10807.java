package com.Questions;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rep = Integer.parseInt(br.readLine());

        int[] arr = new int[rep];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < rep; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int num = Integer.parseInt(br.readLine());

        bw.write(Arrays.stream(arr).filter(n->n == num).count()+"");
        bw.flush();
    }
}
