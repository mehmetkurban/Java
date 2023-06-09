package com.test;

import java.util.*;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "{" + "name='" + name + '\'' + ", age=" + age + '}';
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

class ComparatorObject {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>(Arrays.asList(
				new Person("John", 15), new Person("Sam", 25),
				new Person("Will", 20), new Person("Dan", 20), 
				new Person("Joe", 10)));
		
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getAge() - p2.getAge();
			}
		});

//		persons.sort((p1, p2) -> {
//			return p1.getAge() > p2.getAge()?1:-1;
//			return p1.getName().compareToIgnoreCase(p2.getName());
//		});
		
		
		System.out.println(persons); 
		System.out.println(persons.get(0)); 
		
	}
}
