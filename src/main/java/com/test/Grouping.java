package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {

	public static void main(String[] args) {
		String str = "This this is is done by ING ING";
		
		/*1*/
		Map<String, List<String>> map = Arrays.stream(str.split(" "))
			.collect(Collectors.groupingBy(word -> word.equalsIgnoreCase(word)?word:""));
		map.forEach( (key,value) -> System.out.println("Word: "+key+"\n"+"Count: "+value.size()+"\n"));
		
		
		/*11*/
//		Map<String,Integer> map2 = new HashMap<String, Integer>();
//		List<String> list =Arrays.asList(str.split(" "));
//		for(int i=0;i<list.size();i++) {
//			String word = list.get(i);
//			int wordCount=0;
//			if(map2.get(word)!=null && map2.get(word)!=0) {
//				wordCount = map2.get(word).intValue();
//			}
//			map2.put(word, ++wordCount);
//		}
//		map2.forEach( (key,value) -> System.out.println("Word: "+key+"\n"+"Count: "+value+"\n"));
		
		Map<Object, List<String>> map3 = Arrays.stream(str.split(" "))
			.collect(Collectors.groupingBy(word-> Integer.valueOf(word.length())));
		map3.forEach( (key,value) -> System.out.println("Word Size: "+key+"\n"+"Words Count: "+value.size()+""+value+" \n"));
		
	}

}
