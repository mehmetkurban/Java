package com.test;

import java.util.stream.IntStream;

public class FizzBuzz {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 100)
			.mapToObj(i -> i%3 == 0 ? 
					(i%5== 0 ? "FizzBuzz": "Fizz") :
					(i%5== 0) ? "Buzz" : Integer.toString(i))
			.forEach(System.out::println);
		
		int number=15;
		boolean result = IntStream.of(number)
			.allMatch(i -> i%3==0 & i%5 ==0 );
		System.out.println(result);
			
	}
}
