package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9184 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] val = new int[3];
        while(true){
            int i = 0;
            st = new StringTokenizer(br.readLine());
            val[0] = Integer.parseInt(st.nextToken());
            val[1] = Integer.parseInt(st.nextToken());
            val[2] = Integer.parseInt(st.nextToken());

            if(val[0] == -1 && val[1] == -1 && val[2] == -1) break;

            System.out.println("w(" + val[0]+ ", "+ val[1]+ ", "+ val[2]+") = "+ recursive(val[0], val[1], val[2]));
        }
    }

    static int[][][] memo = new int[51][51][51];
    public static int recursive(int a, int b, int c){
        if(a <= 0 || b <= 0 || c <= 0) return 1;

        if(memo[a][b][c] > 0) return memo[a][b][c];

        if(a > 20 || b > 20 || c > 20) {
            return memo[20][20][20] = recursive(20, 20, 20);
        }
        if(a < b && b < c) {
            return memo[a][b][c] = recursive(a, b, c-1) + recursive(a, b-1, c-1) - recursive(a, b-1, c);
        }

        return memo[a][b][c] = recursive(a-1, b, c) + recursive(a-1, b-1, c) + recursive(a-1, b, c-1) - recursive(a-1, b-1, c-1);
    }
}
