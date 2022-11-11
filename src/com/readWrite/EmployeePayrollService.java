package com.readWrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

	public void empPayrollRead() throws IOException {
		Path playPath = Paths.get(
				"C:\\Users\\menad\\OneDrive\\Desktop\\Blabz practice problem\\Day2Problems\\Day-27-IO-ReadWrite\\src\\com");

		Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::print);
		Files.newDirectoryStream(playPath).forEach(System.out::println);
		Files.newDirectoryStream(playPath, path -> path.toFile().isFile() && path.toString().startsWith("temp"));

	}

	public static void main(String[] args) throws IOException {
		EmployeePayrollService emp = new EmployeePayrollService();

		emp.empPayrollRead();
	}

}
