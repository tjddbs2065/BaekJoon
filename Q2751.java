package com.Questions;

import java.io.*;

public class Q2751 {
    static int[] tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        tmp = new int[n];

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        mergeSort(arr, 0, arr.length - 1);
        for(int i : arr) sb.append(i).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void mergeSort(int[] arr, int left, int right){
        if(left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        Merge(arr, left, mid, right);
    }

    public static void Merge(int[] arr, int left, int mid, int right){
//        int[] tmp = new int[right - left + 1];

        int l_idx = left, m_idx = mid + 1, idx = left;

        while(l_idx <= mid && m_idx <= right){
            if(arr[l_idx] < arr[m_idx]) tmp[idx++] = arr[l_idx++];
            else tmp[idx++] = arr[m_idx++];
        }

        while(l_idx <= mid) tmp[idx++] = arr[l_idx++];
        while(m_idx <= right) tmp[idx++] = arr[m_idx++];

        for(int i = left; i <= right; i++) arr[i] = tmp[i];
    }
}
