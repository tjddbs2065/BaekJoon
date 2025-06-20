package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long ans = 0;
        for(String str : br.readLine().split(" ")){
            ans += Long.parseLong(str);
        }
        System.out.println(ans);
    }
}
