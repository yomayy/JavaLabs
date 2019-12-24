package com.company;


import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) throws IOException {
        ArraySeparator as = new ArraySeparator();
        Long result = new ForkJoinPool().invoke(new ArraySummator(as.getArray()));
        System.out.println("Результат: " + result);
    }
}
