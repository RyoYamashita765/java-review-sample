package com.exmple.test;

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
	public void printSub() {
		System.out.println("Sub");
	}
}
