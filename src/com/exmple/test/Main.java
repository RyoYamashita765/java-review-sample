package com.exmple.test;

public class Main {
	public static void main(String[] args) {
		int answer = 0;
		while (answer < 42) {
			System.out.println("The answer: " + answer);
			answer += 2;
			if (answer == 42) {
				System.out.println("The answer is 42!");
			}
		}
	}
}
