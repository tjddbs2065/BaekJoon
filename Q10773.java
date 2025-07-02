package com.Questions;

import java.io.*;
import java.util.Arrays;

public class Q10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rep = Integer.parseInt(br.readLine());

        Stack stack = new Stack(rep);

        for(int i = 0; i < rep; i++){
            int num = Integer.parseInt(br.readLine());

            if(num == 0) stack.Pop();
            else stack.Push(num);
        }

        bw.write(Arrays.stream(stack.Get()).sum()+"");
        bw.flush();
    }
}
class Stack{
    int top;
    int[] arr;
    public Stack(int size){
        arr = new int[size + 1];
        top = 0;
    }

    public void Push(int num){
        arr[++top] = num;
    }

    public void Pop(){
        arr[top--] = 0;
    }

    public int[] Get(){
        return arr;
    }
}
