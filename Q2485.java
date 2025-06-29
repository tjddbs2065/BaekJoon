package com.Questions;

import java.io.*;

public class Q2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rep = Integer.parseInt(br.readLine());

        int[] arr = new int[rep];

        int comm = 0;
        for(int i = 0; i < rep; i++){
            arr[i] = Integer.parseInt(br.readLine());

            if(i > 0) comm = gcd(arr[i]-arr[i-1], comm);
        }

        int ans = ((arr[rep-1] - arr[0]) / comm) - rep + 1;

        bw.write(ans+"");
        bw.flush();
    }

    public static int gcd(int a, int b){
        while(b != 0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
