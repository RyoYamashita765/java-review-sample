package com.exmple.test;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		for (int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
		}

		for (int j = 1; j <= 10; j++) {
			System.out.println("j = " + j);
		}
	}

	public void printHello() {
		System.out.println("Hello");
	}

	public void printWorld() {
		System.out.println("World");
	}
}

class Sub {
	public static int test = 42;
	private double value = 3.14;

	public void printSub() {
		System.out.println("Sub");
	}

	public void printTest() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("!");
		list = list.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toCollection(ArrayList::new));
		for (String s : list) {
			System.out.println(s);
		}
	}
}
