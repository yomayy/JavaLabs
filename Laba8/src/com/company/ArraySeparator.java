package com.company;

import java.util.concurrent.RecursiveTask;

public class ArraySeparator {
    private int nums[] = new int[1000000];
    public ArraySeparator(){
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)Math.round((Math.random()*100));
            //System.out.print(nums[i]+", ");
        }
    }

    public int[] getArray(){return nums;}

}
