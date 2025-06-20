package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[2];

        int i = 0;
        for(String str: br.readLine().split(" ")){
            num[i++] = Integer.parseInt(str);
        }

        if(num[0] < num[1]) System.out.println("<");
        if(num[0] > num[1]) System.out.println(">");
        if(num[0] == num[1]) System.out.println("==");
    }
}
