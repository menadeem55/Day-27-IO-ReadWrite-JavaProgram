package com.readWrite;

import java.io.File;
import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.Paths;

import java.util.List;

public class EmployeePayrollService {
	public long listFilesDirectory() throws IOException, InterruptedException {

		long enteries = 0;
		enteries = Files.lines(new File(
				"C:\\Users\\menad\\OneDrive\\Desktop\\Blabz practice problem\\Day2Problems\\Day-27-IO-ReadWrite\\src\\testdemo.txt")
				.toPath()).count();
		System.out.println(enteries);
		return enteries;
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		EmployeePayrollService emp = new EmployeePayrollService();
		emp.listFilesDirectory();

	}
}
