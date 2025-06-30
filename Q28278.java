package com.Questions;

import java.io.*;
import java.util.*;

public class Q28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int rep = Integer.parseInt(br.readLine());

        Stack stack = new Stack(rep);
        for(int i = 0; i < rep; i++){
            st = new StringTokenizer(br.readLine());

            switch (Integer.parseInt(st.nextToken())){
                case 1:{
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                }
                case 2:{
                    bw.write(stack.pop() + "\n");
                    break;
                }
                case 3: {
                    bw.write(stack.size() + "\n");
                    break;
                }
                case 4:{
                    bw.write((stack.isEmpty() ? 1 : 0) + "\n");
                    break;
                }
                case 5: {
                    bw.write(stack.peek()+"\n");
                    break;
                }
            }
        }
        bw.flush();
    }

    public static class Stack{
        int[] stack;
        int top;

        public Stack(int size){
            stack = new int[size + 1];
            top = 0;
        }

        public void push(int num){
            stack[++top] = num;
        }
        public int pop(){
            if(top != 0) return stack[top--];
            else return -1;
        }
        public int peek(){
            if(top != 0) return stack[top];
            return -1;
        }
        public int size(){
            return top;
        }
        public boolean isEmpty(){
            return top == 0;
        }
    }
}

