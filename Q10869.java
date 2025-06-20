package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[2];

        int i = 0;
        for(String num: br.readLine().split(" ")){
            nums[i++] = Integer.parseInt(num);
        }

        System.out.println(nums[0] + nums[1]);
        System.out.println(nums[0] - nums[1]);
        System.out.println(nums[0] * nums[1]);
        System.out.println(nums[0] / nums[1]);
        System.out.println(nums[0] % nums[1]);
    }
}
