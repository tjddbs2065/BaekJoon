package com.Questions;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Q1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rep = Integer.parseInt(br.readLine());

        String[] arr = new String[rep];
        for(int i = 0; i < rep; i++){
            arr[i] = br.readLine();
        }

        mergeSort(arr, 0, arr.length - 1);

        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(arr));

        for(String str: set)
            bw.write(str + "\n");
        bw.flush();
    }

    public static void mergeSort(String[] arr, int left, int right){
        if(left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        Merge(arr, left, mid, right);
    }

    public static void Merge(String[] arr, int left, int mid, int right){
        String[] tmp = new String[right - left + 1];
        int l_idx = left, m_idx = mid + 1, idx = 0;

        while(l_idx <= mid && m_idx <= right){
            if(arr[l_idx].length() != arr[m_idx].length()){
                if(arr[l_idx].length() < arr[m_idx].length()) tmp[idx++] = arr[l_idx++];
                else tmp[idx++] = arr[m_idx++];
            }
            else{
                int cmp = arr[l_idx].compareTo(arr[m_idx]);
                if(cmp < 0) tmp[idx++] = arr[l_idx++];
                else if(cmp > 0) tmp[idx++] = arr[m_idx++];
                else tmp[idx++] = arr[l_idx++];
            }
        }
        while(l_idx <= mid) tmp[idx++] = arr[l_idx++];
        while(m_idx <= right) tmp[idx++] = arr[m_idx++];

        for(int i = 0; i < tmp.length; i++) arr[left + i] = tmp[i];
    }
}
