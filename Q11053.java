package com.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class        Q11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());

        int[] arr = new int[len+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i < len+1; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        int[] dp = new int[len+1];
        for(int j = 1; j < len+1; j++){
            dp[j] = 1; // 초기 자기 자신만을 가리킬 때는 1

            for(int k = 1; k < j; k++){ // 이전 수들을 순회
                if(arr[k] < arr[j]){ // j의 수보다 작은 경우 수열이 성립
                    dp[j] = Math.max(dp[j], dp[k] + 1); // 성립하는 수열 중 가장 긴 수열 선택
                }
            }
            answer = Math.max(dp[j], answer);
        }
        System.out.println(answer);
    }
}
