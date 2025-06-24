package com.Questions;

import java.io.*;

public class Q10989 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        countSort(arr);

        for(int i = 0; i < n; i++){
            bw.write(arr[i]+"\n");
        }
        bw.flush();
    }

    public static void countSort(int arr[]){
        int max = 0;
        for(int num : arr){
            max = Math.max(max, num);
        }

        int[] count = new int[max + 1];
        for(int num : arr){
            count[num]++;
        }

        int idx = 0;
        for(int i = 0; i <= max; i++){
            while(count[i]-- > 0){
                arr[idx++] = i;
            }
        }
    }
}