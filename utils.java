package com.Questions;

public class utils {
    public static void measureTimeNano(String func, Runnable task){
        long start = System.nanoTime();
        task.run();
        long end = System.nanoTime();
        long duration = end - start;

        System.out.println("["+ func + "] 실행 시간: " + duration + " ns");
    }
    public static void measureTimeMillis(String func, Runnable task){
        long start = System.currentTimeMillis();
        task.run();
        long end = System.currentTimeMillis();
        long duration = end - start;

        System.out.println("["+ func + "] 실행 시간: " + duration + " ms");
    }

    public static void printArr(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
