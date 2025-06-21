package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] currTime = new int[2];
        int i = 0;
        for(String str : br.readLine().split(" ")){
            currTime[i++] = Integer.parseInt(str);
        }

        int waitTime = Integer.parseInt(br.readLine());

        if(waitTime >= 60){
            currTime[0] += waitTime / 60;
            waitTime = waitTime % 60;
        }
        currTime[1] += waitTime;

        if(currTime[1] >= 60){
            currTime[0] += currTime[1] / 60;
            currTime[1] = currTime[1] % 60;
        }

        if(currTime[0] >= 24) currTime[0] = currTime[0] % 24;

        System.out.printf("%d %d\n", currTime[0], currTime[1]);
    }
}
