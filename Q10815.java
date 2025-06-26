package com.Questions;

import java.io.*;
import java.util.*;

public class Q10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

//        TreeSet<Integer> tree = new TreeSet<>();
//        int[] arr = new int[n];
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) set.add(Integer.parseInt(st.nextToken()));
//        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < m; i++) {
            int cmp = Integer.parseInt(st.nextToken());

            bw.write(set.contains(cmp) ? "1 " : "0 ");
//            if(binarySearch(arr, cmp)) bw.write("1 ");
//            else bw.write("0 ");
        }
        bw.flush();
    }

    public static boolean binarySearch(int[] arr, int num){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(arr[mid] == num) return true;
            else if(arr[mid] < num) left = mid + 1;
            else  right = mid - 1;
        }
        return false;
    }
}
