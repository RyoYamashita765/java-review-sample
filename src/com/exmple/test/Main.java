package com.exmple.test;

public class Main {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Hello, Java!");
		} else {
			System.out.println("Hello, " + args[0] + "!");
		}
	}
}
