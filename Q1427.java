package com.Questions;

import java.io.*;

public class Q1427 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String n = br.readLine();
        int[] arr = new int[n.length()];

        int i = 0;
        for(String str: n.split("")){
            arr[i++] = Integer.parseInt(str);
        }

        quickSort(arr, 0, arr.length - 1);

        for(int j = 0; j < arr.length; j++){
            sb.append(arr[j]);
        }
        bw.write(sb.toString());
        bw.flush();
    }

    public static void quickSort(int[] arr, int left, int right){
        if(left < right){
            int pivot = Hoare(arr, left, right);

            quickSort(arr, left, pivot);
            quickSort(arr, pivot + 1, right);
        }
    }

    public static int Hoare(int[] arr, int left, int right){
        int pivot = arr[left];

        int i = left - 1;
        int j = right + 1;

        while(true) {
            do { i++; } while (arr[i] > pivot);
            do { j--; } while (arr[j] < pivot);

            if (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            } else return j;
        }
    }
}
