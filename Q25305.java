package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] recv = new int[2];
        int i = 0;
        for(String str: br.readLine().split(" ")){
            recv[i++] = Integer.parseInt(str);
        }

        int[] arr = new int[recv[0]];
        i = 0;
        for(String str: br.readLine().split(" ")){
            arr[i++] = Integer.parseInt(str);
        }

        quickSort(arr, 0, arr.length - 1);

        System.out.println(arr[arr.length - recv[1]]);
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
            do { i++; } while(arr[i] < pivot);
            do { j--; } while(arr[j] > pivot);

            if(i < j){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            else return j;
        }
    }
}

