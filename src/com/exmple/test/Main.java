package com.exmple.test;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Printer printer = new Printer();
	}
}

class Printer {
	public void print() {
		System.out.println("Hello World!");
		System.out.println("(from Printer)");
	}
}
