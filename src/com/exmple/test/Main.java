package com.exmple.test;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello, Main World!");

		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] = " + args[i]);
		}
	}
}
