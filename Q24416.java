package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q24416 {
    static int fibonacci_cnt = 1;
    static int fib_cnt = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        fib(n);
        fibonacci(n);

        System.out.println(fib_cnt);
        System.out.println(fibonacci_cnt);
    }

    public static int fib(int n){
        if(n == 1 || n == 2) return 1;
        else {
            fib_cnt++;
            return (fib(n - 1) + fib(n - 2));
        }
    }

    public static int fibonacci(int n){
        int[] fib = new int[100];
        fib[1] = fib[2] = 1;

        for(int i = 3; i < n; i++){
            fib[i] = fib[i-1] + fib[i-2];
            fibonacci_cnt++;
        }
        return fib[n];
    }
}
