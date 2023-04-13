package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CategorizeWords {

	public static void main(String[] args) {
		String text = "Apple ant bat ball cat cow dog deer elephant fish frog goat horse iguana jaguar kangaroo lion monkey newt octopus penguin quail rabbit snake tiger umbrella vulture whale xenops yak zebra";
		
		Map<String,List<String>> map = Arrays.stream(text.split(" "))
		.collect(Collectors.groupingBy(word -> word.substring(0, 1)));
		
		System.out.println(map);
	}

}
