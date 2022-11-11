package com.readWrite;

import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.Paths;

import java.util.List;

public class EmployeePayrollService {

	public void listFilesDirectory() throws IOException, InterruptedException {

		List<String> line = Files.readAllLines(Paths.get(
				"C:\\Users\\menad\\OneDrive\\Desktop\\Blabz practice problem\\Day2Problems\\Day-27-IO-ReadWrite\\src\\testdemo.txt"));
		for (String lines : line) {
			System.out.println(lines);
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		EmployeePayrollService obj = new EmployeePayrollService();
		obj.listFilesDirectory();
	}
}