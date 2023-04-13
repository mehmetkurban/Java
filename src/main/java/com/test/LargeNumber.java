package com.test;

import java.util.Comparator;
import java.util.stream.IntStream;

public class LargeNumber {
	public static void main(String[] args) {
		int number = 7957;
		int digitToAdd = 5;
		System.out.println( String.valueOf(number).substring(0, 1));
		
		int largestNumber = IntStream.rangeClosed(0, 4)
		        .mapToObj(i -> String.valueOf(number).substring(0, i) + digitToAdd + String.valueOf(number).substring(i))
		        .map(Integer::valueOf)
		        .max(Comparator.reverseOrder())
		        .orElse(0);

		System.out.println(largestNumber);
		

		
	}
}
