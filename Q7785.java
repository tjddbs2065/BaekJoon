package com.Questions;

import java.io.*;
import java.util.*;

public class Q7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rep = Integer.valueOf(br.readLine());

        TreeSet<String> atOffice = new TreeSet<>(Collections.reverseOrder());
        StringTokenizer st;
        for(int i = 0; i < rep; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String stat = st.nextToken();

            if(stat.equals("enter"))
                atOffice.add(name);
            else atOffice.remove(name);
        }

        for(String name : atOffice){
            bw.write(name + "\n");
        }
        bw.flush();
    }
}
