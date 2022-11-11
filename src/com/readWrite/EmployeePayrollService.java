package com.readWrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class EmployeePayrollService {

	public void listFilesDirectory() throws IOException, InterruptedException {
		ArrayList<String> writing = new ArrayList<String>();

		writing.add("Id : 1001");
		writing.add("Name : Nadeem Akhtar");
		writing.add("Salary : 84761");
		// File Exist => Override
		// Will create new file if not exist
		Files.write(Paths.get(
				"C:\\Users\\menad\\OneDrive\\Desktop\\Blabz practice problem\\Day2Problems\\Day-27-IO-ReadWrite\\src\\testdemo.txt"),
				writing, StandardOpenOption.CREATE);
		System.out.println("Exporting Into File");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		EmployeePayrollService obj = new EmployeePayrollService();
		obj.listFilesDirectory();
	}
}