package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Polidrome {
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("racecar", "level", "deified", "hello", "world");

		List<String> palindromes = words.stream()
		        .filter(word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
		        .collect(Collectors.toList());
		System.out.println(palindromes);
		
		
		List<String> palindromes2 = words.stream()
		        .filter(word -> IntStream.range(0, word.length() / 2)
		                .allMatch(i -> word.charAt(i) == word.charAt(word.length() - i - 1)))
		        .collect(Collectors.toList());
		System.out.println(palindromes2);
		
		String polidrome="racecar";
		boolean isPolidrome =
			Stream.of(polidrome)
			.filter(w -> 
					IntStream.range(0, w.length()/2)
					.allMatch(y-> w.charAt(y) == w.charAt(w.length()-y-1)))
			.collect(Collectors.joining())
			.equals(polidrome);
		System.out.println(isPolidrome);
	}
}
