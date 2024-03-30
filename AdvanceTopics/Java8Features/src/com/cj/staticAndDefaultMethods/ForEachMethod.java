package com.cj.staticAndDefaultMethods;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// implementation class for consumer to use without lambda expression
class MyConsumer implements Consumer<String> {
	public void accept(String t) {
		System.out.println(t);
	}
}

public class ForEachMethod {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Faisal", "Malik", "Shubham", "Azam Sir", "Hashma");
//		list.forEach(name -> System.out.println(name)); //with lambda expression
		list.forEach(new MyConsumer()); //without lambda expression  
	}
}
