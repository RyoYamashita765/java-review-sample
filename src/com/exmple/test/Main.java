package com.exmple.test;

public class Main {
	public static void main(String[] args) {
		switch (args.length + 1) {
		case 1:
			System.out.println("No arguments");
			break;
		default:
			System.out.println("Arguments:");
			break;
		}
	}
}
