package com.Questions;

import java.io.*;
import java.util.*;

public class Q1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int repNum = Integer.parseInt(st.nextToken());
        int cmpNum = Integer.parseInt(st.nextToken());

        Map<String, Integer> codex = new HashMap<>();
        Map<Integer, String> dict = new HashMap<>();

        for(int i = 1; i <= repNum; i++){
            String tmp = br.readLine();
            codex.put(tmp, i);
            dict.put(i, tmp);
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(codex.entrySet());

        for(int i = 0; i < cmpNum; i++){
            String str = br.readLine();
            if(!isNumber(str)){
                bw.write(codex.get(str) + "\n");
            }else{
                bw.write(dict.get(Integer.parseInt(str)) + "\n");
            }
        }
        bw.flush();
    }

    public static boolean isNumber(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
