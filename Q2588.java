package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2588 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int multiplicand = Integer.parseInt(br.readLine());
        String multiplier = br.readLine();

        int total = 0;
        int digit = 1;

        for(int i = multiplier.length() - 1; i >= 0; i--){
            int partialProduct = multiplicand * (multiplier.charAt(i) - '0');
            System.out.println(partialProduct);

            total += partialProduct * digit;
            digit *= 10;
        }
        System.out.println(total);
    }
}
