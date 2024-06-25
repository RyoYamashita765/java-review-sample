package com.exmple.test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("Please enter the price: ");
		try (Scanner scanner = new Scanner(System.in)) {
			String price = scanner.nextLine();
			int priceInt = Integer.parseInt(price);
			int tax = (int)(priceInt * 10 / 100);
			int totalPrice = priceInt + tax;

			System.out.println("Price with tax: " + totalPrice);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
