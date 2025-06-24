package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int rep = Integer.parseInt(br.readLine());
        for(int i = 0; i < rep; i++){
            st = new StringTokenizer(br.readLine());

            int price = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());

            total -= price * cnt;
        }

        if(total == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
