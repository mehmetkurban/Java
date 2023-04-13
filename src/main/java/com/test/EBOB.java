package com.test;

import java.util.stream.IntStream;

public class EBOB {
	public static void main(String[] args) {
        int a = 24;
        int b = 36;
        int result = IntStream.rangeClosed(1, Math.min(a, b))
                .filter(i -> a % i == 0 && b % i == 0)
                .reduce(1, (x, y) -> y);
        System.out.println(result+"\n"); // 12
        //oo
        
        IntStream.rangeClosed(1, Math.min(a, b))
                .filter(i -> a % i == 0 && b % i == 0)
                .forEach(System.out::println);;
	}
}
