package com.Questions;

import java.io.*;
import java.util.StringTokenizer;

public class Q11650 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int rep = Integer.parseInt(br.readLine());

        int[][] arr = new int[rep][2];
        for(int i = 0; i < rep; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        mergeSort(arr, 0, arr.length - 1);

        for(int i = 0; i < rep; i++)
            bw.write(arr[i][0] + " " + arr[i][1] + "\n");
        bw.flush();
    }

    public static void mergeSort(int[][] arr, int left, int right){
        if(left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            Merge(arr, left, mid, right);
        }
    }

    public static void Merge(int[][] arr, int left, int mid, int right){
        int[][] tmp = new int[right - left + 1][2];
        int l_idx = left, m_idx = mid + 1, idx = 0;

        while(l_idx <= mid && m_idx <= right){
            if(arr[l_idx][0] != arr[m_idx][0]) {
                if (arr[l_idx][0] < arr[m_idx][0]) tmp[idx++] = arr[l_idx++];
                else tmp[idx++] = arr[m_idx++];
            }
            else {
                if(arr[l_idx][1] < arr[m_idx][1]) tmp[idx++] = arr[l_idx++];
                else tmp[idx++] = arr[m_idx++];
            }
        }

        while(l_idx <= mid) tmp[idx++] = arr[l_idx++];
        while(m_idx <= right) tmp[idx++] = arr[m_idx++];

        for(int i = 0; i < tmp.length; i++) arr[left+i] = tmp[i];
    }
}
