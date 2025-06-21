package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean x = Integer.parseInt(br.readLine()) > 0 ? true : false;
        boolean y = Integer.parseInt(br.readLine()) > 0 ? true : false;

        int ans = 0;
        if(x && y) ans = 1;
        else if(!x && !y) ans = 3;
        else if(x && !y) ans = 4;
        else ans = 2;

        System.out.println(ans);
    }
}
