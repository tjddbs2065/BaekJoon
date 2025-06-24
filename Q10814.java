package com.Questions;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int rep = Integer.parseInt(br.readLine());

        String[][] arr = new String[rep][2];
        for(int i = 0; i < rep; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
        Arrays.sort(arr, (a, b)->{
            if(a[0].equals(b[0]))
                return 0;
            return Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));
        });

        for(String[] str: arr) bw.write(str[0] + " " + str[1] + "\n");
        bw.flush();
    }
}
