package com.Questions;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Q11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder str = new StringBuilder(br.readLine());

        Set<String> set = new HashSet<>();
        for(int i =1; i <= str.length(); i++){
            for(int j = 0; j < str.length() + 1 - i; j++){
                String tmp = str.substring(j, j+i);
                set.add(tmp);
            }
        }
        bw.write(set.size()+"");
        bw.flush();
    }
}
