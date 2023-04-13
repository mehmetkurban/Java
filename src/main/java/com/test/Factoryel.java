package com.test;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Factoryel {
	public static void main(String[] args) {
		int number = 6;

		int result = IntStream.range(1, number)
				.reduce(1, (a, b) -> (a * b));
		System.out.println(result);

		int n = 5;
		BigInteger result2 = LongStream.rangeClosed(1, n)
				.mapToObj(BigInteger::valueOf)
				.reduce(BigInteger.ONE,BigInteger::multiply);
		System.out.println(result2);
	}
}
