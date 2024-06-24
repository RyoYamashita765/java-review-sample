package com.exmple.test;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		if (args.length >= 1) {
			System.out.println("========= Arguments =========");
			for (String arg : args) {
				System.out.println("  [" + arg + "]");
			}
		}
	}
}
