package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] time = new int[2];

        int i = 0;
        for(String str : br.readLine().split(" ")){
            time[i++] = Integer.parseInt(str);
        }

        if(time[1] >= 45) time[1] -= 45;
        else{
            if(time[0] == 0) time[0] = 23;
            else time[0] -= 1;

            time[1] = 60 + time[1] - 45;
        }

        System.out.printf("%d %d\n", time[0], time[1]);
    }
}
