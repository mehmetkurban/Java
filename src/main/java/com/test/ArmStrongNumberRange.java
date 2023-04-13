package com.test;

import java.util.stream.IntStream;

public class ArmStrongNumberRange {

	public static void main(String[] args) {
		int n=1000;
		
		IntStream.rangeClosed(0, n)
			.filter(ArmStrongNumberRange::isArmStrong)
			.forEach(System.out::println);
			
	}
	
	private static boolean isArmStrong(int number) {
		return String.valueOf(number)
				.chars()
				.map(Character::getNumericValue)
				.map(n -> (int) Math.pow(n, String.valueOf(number).length()))
				.sum() == number;
	}
}
