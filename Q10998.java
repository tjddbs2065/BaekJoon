package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ans = 1;
        for(String ch : br.readLine().split(" ")){
            ans *= Integer.parseInt(ch);
        }
        System.out.println(ans);
    }
}
