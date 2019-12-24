package com.company;

import java.util.concurrent.RecursiveTask;

public class ArraySummator extends RecursiveTask<Long> {
    private int[] arr;

    ArraySummator(int[] array){this.arr = array;}

    @Override
    protected Long compute() {
        long result = 0;
        if (arr.length > 20) {
            // ділимо на дві частини
            int length = arr.length / 2;
            int[] firstArr = new int[length];
            int[] secondArr = new int[arr.length - length];
            // копіюємо массиви
            System.arraycopy(arr, 0,
                    firstArr,0, firstArr.length);
            System.arraycopy(arr, length,
                    secondArr,0, secondArr.length);
            ArraySummator subtask1 = new ArraySummator(firstArr);
            ArraySummator subtask2 = new ArraySummator(secondArr);
            subtask1.fork();
            subtask2.fork();
            result = subtask1.join() + subtask2.join();
        }else{
            for(int num: arr){
                result += num;
            }
        }
        return result;
    }
}
