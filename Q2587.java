package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int avg = 0;

        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = Integer.parseInt(br.readLine());
            avg += arr[i];
        }
        avg /= 5;
        quickSort(arr, 0, arr.length - 1);

        System.out.println(avg);
        System.out.println(arr[2]);
    }

    public static void quickSort(int[] arr, int left, int right){
        if(left < right){
            int pivot = Hoare(arr, left, right);

            quickSort(arr, left,  pivot);
            quickSort(arr, pivot + 1, right);
        }
    }

    public static int Hoare(int[] arr, int left, int right){
        int pivot = arr[left];

        int i = left - 1;
        int j = right + 1;

        while(true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);

            if (i < j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            else return j;
        }
    }
}
