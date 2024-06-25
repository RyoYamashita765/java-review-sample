package com.exmple.test;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		printHello();
	}

	public static void initClasses() {
		Dummy dummy = new Dummy();
		Cache cache = new Cache();
		Printer printer = new Printer();
	}
}

interface Printer {
	void printMessage(String message);

	default void printHello() {
		System.out.println("Hello");
	}
}
