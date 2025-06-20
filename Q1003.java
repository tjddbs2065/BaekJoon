package com.Questions;

import java.util.Scanner;

// 피보나치 함수
public class Q1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rep = sc.nextInt();

        for(int i = 0; i < rep; i++){
            int num = sc.nextInt();

            fib(num);
        }
    }

    public static void fib(int num){
        int dp[][] = new int[num + 1][2];

        if(num >= 0) {
            dp[0][0] = 1;
            dp[0][1] = 0;
        }
        if(num >= 1){
            dp[1][0] = 0;
            dp[1][1] = 1;
        }

        for(int i = 2; i < num + 1; i++){
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        System.out.printf("%d %d\n", dp[num][0], dp[num][1]);
    }
}
