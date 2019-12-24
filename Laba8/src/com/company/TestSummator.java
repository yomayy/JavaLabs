package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class TestSummator {

    @Test
    public void TestArray(){
        int[] arr = new int [1000000];

        Long compare = 1000000L;
        Long res = new ForkJoinPool().invoke(new ArraySummator(arr));
        Assert.assertEquals(compare, res);
    }
}
