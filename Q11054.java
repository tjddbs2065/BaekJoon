package com.Questions;

import java.io.*;
import java.util.StringTokenizer;

public class Q11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rep = Integer.parseInt(br.readLine());

        int[] arr = new int[rep + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= rep; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] fdp = new int[rep + 1];
        int[] bdp = new int[rep + 1];
        for(int i = 1; i <= rep; i++){
            fdp[i] = 0;
            bdp[rep + 1 - i] = 1;

            for(int j = 1; j < i; j++){
                if(arr[j] < arr[i]) fdp[i] = Math.max(fdp[i], fdp[j] + 1);
            }
            for(int j = rep; j > rep + 1 - i; j--){
                if(arr[j] < arr[rep+1-i]) bdp[rep - i + 1] = Math.max(bdp[rep - i+1], bdp[j] +1);
            }
        }

        int max = 0;
        for(int i = 1; i <= rep; i++)
            max = Math.max(max, fdp[i]+bdp[i]);
        bw.write(max+"");
        bw.flush();
    }
}
