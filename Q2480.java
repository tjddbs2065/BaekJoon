package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean[] isSame = new boolean[3];
        isSame[0] = arr[0] == arr[1];
        isSame[1] = arr[1] == arr[2];
        isSame[2] = arr[0] == arr[2];

        if(isSame[0] && isSame[1]) System.out.println(10000 + arr[0] * 1000);
        else if(isSame[0]) System.out.println(1000 + arr[0] * 100);
        else if(isSame[1]) System.out.println(1000 + arr[1] * 100);
        else if(isSame[2]) System.out.println(1000 + arr[0] * 100);
        else{
            int max = Math.max(arr[0], arr[1]);
            max = Math.max(max, arr[2]);
            System.out.println(max * 100);
        }
    }
}
