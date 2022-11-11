package com.readWrite;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

	public void empPayrollRead() throws IOException {
		List<String> lines = Files.readAllLines(Paths.get(
				"C:\\Users\\menad\\OneDrive\\Desktop\\Blabz practice problem\\Day2Problems\\Day-27-IO-ReadWrite\\src\\com\\readWrite.txt"));

		for (String line : lines) {

		}

	}

	public void writeDataEmployeePayRoll() throws IOException {
		ArrayList<String> data = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		data.add(sc.next());
		System.out.println("Enter Name");
		data.add(sc.next());
		System.out.println("Enter Salary");
		data.add(sc.next());
		Files.write(Paths.get(
				"C:\\Users\\menad\\OneDrive\\Desktop\\Blabz practice problem\\Day2Problems\\Day-27-IO-ReadWrite\\src\\com\\readWrite.txt"),
				data, StandardOpenOption.CREATE);

	}

	public static void main(String[] args) throws IOException {
		EmployeePayrollService emp = new EmployeePayrollService();
		emp.writeDataEmployeePayRoll();
		emp.empPayrollRead();
	}

}
