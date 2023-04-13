package com.test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArmStrongNumber {
	public static void main(String[] args) {
		
		int number=153;
		
        boolean isArmstrong = Stream.of(String.valueOf(number)
                .split(""))
                .mapToInt(Integer::parseInt)
                .map(n -> (int) Math.pow(n, String.valueOf(number).length()))
                .sum() == number;
        System.out.println(number + " is " + (isArmstrong ? "" : "not ") + "an Armstrong number");
    
        boolean isArmstrong2 = IntStream.of(
                String.valueOf(number)
                        .chars()
                        .map(Character::getNumericValue)
                        .toArray())
                .map(n -> (int) Math.pow(n, String.valueOf(number).length()))
                .sum() == number;
        System.out.println(number + " is " + (isArmstrong2 ? "" : "not ") + "an Armstrong number");
        
        IntStream.of(
                String.valueOf(number)
                        .chars()
                        .map(Character::getNumericValue)
                        .toArray())
                .map(n -> (int) Math.pow(n, String.valueOf(number).length()))
                .forEach(System.out::println);
	}
	
	public static boolean isArmStrongNumber(int number) {
		return 	IntStream.of(
					String.valueOf(number)
					.chars()
					.map(Character::getNumericValue)
					.toArray())
				.map(n -> (int) Math.pow(n, String.valueOf(number).length()))
				.sum() == number;
	}
	
	public static boolean isArmStrongNumber2(int number) {
		return Stream.of(
					String.valueOf(number)
					.split(""))
			   .mapToInt(Integer::parseInt)
			   .map(n-> (int) Math.pow(n, String.valueOf(number).length()))
			   .sum() == number;
	}
}
