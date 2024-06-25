package com.exmple.test;

public class Main {
	public static void main(String[] args) {
		CsvFileReader csvFileReader = new CsvFileReader();
		String csvFileContent = csvFileReader.read("foobar.csv");
		System.out.println(csvFileContent);
	}
}

class CsvFileReader {
	public String read(String path) {
		// Dummy
		return "csv file content";
	}
}
