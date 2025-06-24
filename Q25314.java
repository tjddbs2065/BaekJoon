package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int rep = Integer.parseInt(br.readLine());
        for(int i = 1; i <= rep; i+=4){
            sb.append("long ");
        }
        sb.append("int");

        System.out.println(sb);
    }
}