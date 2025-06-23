package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];

        for(int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        quickSort(arr, 0, arr.length - 1);

        for(int n : arr){
            System.out.println(n);
        }
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

        while(true){
            do { j--; } while (arr[j] > pivot);
            do { i++; } while (arr[i] < pivot);

            if(i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            else{
                return j; // pivot
            }
        }
    }
}
