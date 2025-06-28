package com.Questions;

import java.io.*;
import java.util.StringTokenizer;

public class Q1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[2];
        a[0] = Integer.parseInt(st.nextToken());
        a[1] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] b = new int[2];
        b[0] = Integer.parseInt(st.nextToken());
        b[1] = Integer.parseInt(st.nextToken());

        int lcm = a[1] * (b[1] / gcd(a[1], b[1]));
        int result = (a[0] * (lcm / a[1])) + (b[0] * (lcm / b[1]));

        int same = gcd(lcm, result);

        bw.write(result / same +" "+ lcm/same);
        bw.flush();
    }

    public static int gcd(int a, int b){
        while(b != 0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
