package com.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorTest {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("I");
		myList.add("am");
		myList.add("Turkey");
		myList.add("from");
		
		/*1*/
		myList.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length()>o2.length()?-1:1;
			}
		});
		
		/*11*/
		myList.sort( (w1,w2) ->{
			return w1.length()>w2.length()?-1:1;
		});
		
		/*111*/
		myList = myList.stream()
				.sorted((o1,o2) -> o1.length()>o2.length()?1:-1)
				.collect(Collectors.toList());
		
		myList.forEach(System.out::println);
	}
}
